package com.solvd.automation.carina.demo.reqresapi;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/api/users/23", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/reqres_users/_get/not_found_rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.NOT_FOUND_404)
public class GetUserNotFoundMethod extends AbstractApiMethodV2 {
	
	public GetUserNotFoundMethod() {
		replaceUrlPlaceholder("base_url", Configuration.getRequired("reqres_api_url"));
	}
}
