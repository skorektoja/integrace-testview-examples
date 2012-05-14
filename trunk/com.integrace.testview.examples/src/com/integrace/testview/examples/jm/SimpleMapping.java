package com.integrace.testview.examples.jm;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.sap.aii.mapping.api.AbstractTransformation;
import com.sap.aii.mapping.api.StreamTransformationException;
import com.sap.aii.mapping.api.TransformationInput;
import com.sap.aii.mapping.api.TransformationOutput;

public class SimpleMapping extends AbstractTransformation {
	public void transform(TransformationInput arg0, TransformationOutput arg1)
			throws StreamTransformationException {

		getTrace().addInfo("JAVA Mapping Called");

		String inData = convertStreamToString(arg0.getInputPayload()
				.getInputStream());

		try {
			arg1.getOutputPayload().getOutputStream().write(
					inData.getBytes("UTF-8"));
		}
	catch (Exception exception1) {
		}

	}

	public String convertStreamToString(InputStream in) {
		StringBuffer sb = new StringBuffer();
		try {
			InputStreamReader isr = new InputStreamReader(in);
			Reader reader = new BufferedReader(isr);
			int ch;
			while ((ch = in.read()) > -1) {
				sb.append((char) ch);
			}
			reader.close();
		} catch (Exception exception) {
		}
		return sb.toString();
	}
}