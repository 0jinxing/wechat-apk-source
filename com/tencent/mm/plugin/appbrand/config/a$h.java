package com.tencent.mm.plugin.appbrand.config;

import com.tencent.mm.plugin.appbrand.config.a.a.b;
import org.json.JSONObject;

public abstract class a$h
{
  static final JSONObject hfE = new JSONObject();
  public boolean hfA = false;
  public boolean hfB = false;
  public String hfC;
  public String hfD;
  public String hfo;
  public String hfs;
  public String hft;
  public double hfu = 1.0D;
  public String hfv = "default";
  public String hfw = "#000000";
  public String hfx;
  public boolean hfy = false;
  public boolean hfz = false;

  public static a.b yV(String paramString)
  {
    if ("landscape".equals(paramString))
      paramString = a.b.hiN;
    while (true)
    {
      return paramString;
      if ("portrait".equals(paramString))
        paramString = a.b.hiK;
      else if ("auto".equals(paramString))
        paramString = a.b.hiL;
      else
        paramString = null;
    }
  }

  public final boolean ayx()
  {
    return "custom".equalsIgnoreCase(this.hfv);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a.h
 * JD-Core Version:    0.6.2
 */