package com.sauvini.pipeline.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class PipelineHandler implements RequestHandler<String, String> {

	@Override
	public void handleRequest(EmiCalculatorDto emiCalculatorDto, Context context) {
			System.out.println("Lambda hit");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseCodeModel;
	}
}
