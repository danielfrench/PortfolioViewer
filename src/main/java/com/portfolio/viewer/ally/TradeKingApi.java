package com.portfolio.viewer.ally;

import java.io.Serializable;
import com.github.scribejava.core.builder.api.DefaultApi10a;
import com.github.scribejava.core.model.OAuth1RequestToken;


public class TradeKingApi extends DefaultApi10a implements Serializable {

  private static final long serialVersionUID = -747144058442870871L;
  private static final String REQUEST_TOKEN_RESOURCE =
      "https://developers.tradeking.com/oauth/request_token";
  private static final String ACCESS_TOKEN_RESOURCE =
      "https://developers.tradeking.com/oauth/access_token";
  private static final String AUTHORIZE_URL =
      "https://developers.tradeking.com/oauth/authorize?oauth_token=%s";


  @Override
  public String getRequestTokenEndpoint() {
    return REQUEST_TOKEN_RESOURCE;
  }

  @Override
  public String getAccessTokenEndpoint() {
    return ACCESS_TOKEN_RESOURCE;
  }

  @Override
  public String getAuthorizationUrl(OAuth1RequestToken requestToken) {
    return String.format(AUTHORIZE_URL, requestToken.getToken());
  }

  @Override
  protected String getAuthorizationBaseUrl() {
    return AUTHORIZE_URL;
  }
}
