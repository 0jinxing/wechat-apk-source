package com.tencent.mm.plugin.appbrand.jsapi.websocket;

import android.support.annotation.Keep;

public class WssConfig
{

  @Keep
  int bz_type;

  @Keep
  int handshake_timeout;

  @Keep
  int pong_timeout;

  @Keep
  boolean skip_domain_check;

  @Keep
  boolean tcp_no_delay;

  public WssConfig()
  {
    this.pong_timeout = -1;
    this.handshake_timeout = -1;
    this.tcp_no_delay = false;
    this.skip_domain_check = false;
    this.bz_type = 0;
  }

  public WssConfig(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, int paramInt3)
  {
    this.pong_timeout = paramInt1;
    this.handshake_timeout = paramInt2;
    this.tcp_no_delay = paramBoolean1;
    this.skip_domain_check = paramBoolean2;
    this.bz_type = paramInt3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.websocket.WssConfig
 * JD-Core Version:    0.6.2
 */