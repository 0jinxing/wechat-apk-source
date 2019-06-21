package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.plugin.appbrand.s.k;
import com.tencent.mm.plugin.appbrand.widget.input.d.b;
import com.tencent.mm.plugin.appbrand.widget.input.d.d;
import com.tencent.mm.plugin.appbrand.widget.input.d.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

abstract class a<P extends f> extends com.tencent.mm.plugin.appbrand.jsapi.a<u>
{
  protected static void S(int paramInt, String paramString)
  {
    v.Zp().y("AppBrandJsInput@".concat(String.valueOf(paramInt)), true).ae("passing_data", paramString);
  }

  protected static void a(int paramInt, u paramu)
  {
    if (paramu == null);
    while (true)
    {
      return;
      v.Zp().y("AppBrandJsInput@".concat(String.valueOf(paramInt)), true).j("webview_reference", new WeakReference(paramu));
    }
  }

  protected static String ol(int paramInt)
  {
    return v.Zp().y("AppBrandJsInput@".concat(String.valueOf(paramInt)), true).getString("passing_data", "");
  }

  protected boolean a(P paramP, JSONObject paramJSONObject, u paramu, int paramInt)
  {
    boolean bool = false;
    label260: label394: 
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramJSONObject.getString("style"));
    }
    catch (Exception localException2)
    {
      label274: 
      try
      {
        paramP.jjp = Integer.valueOf(g.g(localJSONObject, "width"));
      }
      catch (Exception localException2)
      {
        label47: label183: label197: label462: 
        try
        {
          JSONObject localJSONObject;
          paramP.jjq = Integer.valueOf(g.g(localJSONObject, "height"));
          paramP.jjr = Integer.valueOf(g.g(localJSONObject, "top"));
          paramP.jjs = Integer.valueOf(g.g(localJSONObject, "left"));
          label228: label246: label632: 
          while (true)
          {
            if (localJSONObject == null)
            {
              if (aDx())
                break label350;
              ab.e("MicroMsg.AppBrandJsApiInputBase", "null style obj");
              paramu.M(paramInt, j("fail:invalid data", null));
              return bool;
              localException1 = localException1;
              localJSONObject = null;
            }
            while (true)
            {
              while (true)
              {
                if (aDx())
                  break label632;
                ab.e("MicroMsg.AppBrandJsApiInputBase", "get position info from style, exp = %s", new Object[] { bo.l(localException1) });
                paramu.M(paramInt, j("fail:invalid data", null));
                break;
                paramP.hdi = localJSONObject.optString("fontWeight", null);
                try
                {
                  while (true)
                  {
                    paramP.jjt = Integer.valueOf(g.g(localJSONObject, "minHeight"));
                    try
                    {
                      while (true)
                      {
                        paramP.jju = Integer.valueOf(g.g(localJSONObject, "maxHeight"));
                        paramP.hdq = localJSONObject.optString("textAlign", null);
                        try
                        {
                          while (true)
                          {
                            paramP.jjw = Integer.valueOf(g.by(localJSONObject.getString("color"), -16777216));
                            try
                            {
                              while (true)
                              {
                                paramP.jjv = Integer.valueOf(g.by(localJSONObject.getString("backgroundColor"), 0));
                                try
                                {
                                  while (true)
                                  {
                                    paramP.jjx = Float.valueOf(g.i(localJSONObject, "fontSize"));
                                    try
                                    {
                                      paramP.jjJ = Integer.valueOf(g.g(localJSONObject, "marginBottom"));
                                      paramP.jjN = d.bv(localJSONObject.opt("lineSpace"));
                                      if (paramP.jjN != null)
                                        paramP.jjN = Integer.valueOf(g.qb(paramP.jjN.intValue()));
                                      paramP.jjO = d.bv(localJSONObject.opt("lineHeight"));
                                      if (paramP.jjO != null)
                                        paramP.jjO = Integer.valueOf(g.qb(paramP.jjO.intValue()));
                                    }
                                    catch (Exception paramu)
                                    {
                                      try
                                      {
                                        while (true)
                                        {
                                          paramP.jjH = Boolean.valueOf(paramJSONObject.getBoolean("autoSize"));
                                          paramP.jjo = paramJSONObject.optString("defaultValue", paramJSONObject.optString("value", null));
                                          try
                                          {
                                            while (true)
                                            {
                                              paramP.jjy = Integer.valueOf(paramJSONObject.getInt("maxLength"));
                                              paramP.jjz = paramJSONObject.optString("placeholder");
                                              try
                                              {
                                                while (true)
                                                {
                                                  paramu = new org/json/JSONObject;
                                                  paramu.<init>(paramJSONObject.getString("placeholderStyle"));
                                                  paramP.jjC = Integer.valueOf(g.Ef(paramu.getString("color")));
                                                  paramP.jjB = Integer.valueOf(g.g(paramu, "fontSize"));
                                                  paramP.jjA = paramu.optString("fontWeight", "normal");
                                                  try
                                                  {
                                                    paramP.jjE = Boolean.valueOf(paramJSONObject.getBoolean("hidden"));
                                                  }
                                                  catch (JSONException paramu)
                                                  {
                                                    try
                                                    {
                                                      paramP.jjD = Boolean.valueOf(paramJSONObject.getBoolean("disabled"));
                                                    }
                                                    catch (Exception paramu)
                                                    {
                                                      try
                                                      {
                                                        paramP.jjI = Boolean.valueOf(paramJSONObject.getBoolean("fixed"));
                                                        paramP.jjK = b.EI(paramJSONObject.optString("confirmType"));
                                                      }
                                                      catch (Exception paramu)
                                                      {
                                                        try
                                                        {
                                                          while (true)
                                                          {
                                                            paramP.jjL = Boolean.valueOf(paramJSONObject.getBoolean("confirmHold"));
                                                            paramP.jjM = k.bG(paramJSONObject.opt("adjustPosition"));
                                                            bool = true;
                                                            break;
                                                            paramu = paramu;
                                                            paramP.jjJ = null;
                                                            break label274;
                                                            paramu = paramu;
                                                            paramP.jjE = null;
                                                            continue;
                                                            paramu = paramu;
                                                            paramP.jjD = null;
                                                          }
                                                          paramu = paramu;
                                                          paramP.jjI = null;
                                                        }
                                                        catch (Exception paramu)
                                                        {
                                                          while (true)
                                                            paramP.jjL = null;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              catch (Exception paramu)
                                              {
                                                break label462;
                                              }
                                            }
                                          }
                                          catch (Exception paramu)
                                          {
                                            break label394;
                                          }
                                        }
                                      }
                                      catch (Exception paramu)
                                      {
                                        break label363;
                                      }
                                    }
                                  }
                                }
                                catch (Exception paramu)
                                {
                                  break label260;
                                }
                              }
                            }
                            catch (Exception paramu)
                            {
                              break label246;
                            }
                          }
                        }
                        catch (Exception paramu)
                        {
                          break label228;
                        }
                      }
                    }
                    catch (Exception paramu)
                    {
                      break label197;
                    }
                  }
                }
                catch (Exception paramu)
                {
                  break label183;
                }
              }
              localException2 = localException2;
            }
          }
        }
        catch (Exception localException3)
        {
          label350: label363: break label47;
        }
      }
    }
  }

  protected boolean aDx()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.a
 * JD-Core Version:    0.6.2
 */