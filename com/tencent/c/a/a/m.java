package com.tencent.c.a.a;

import android.content.Context;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONArray;
import org.json.JSONObject;

final class m
{
  private int cbC;
  private JSONObject cbD;
  protected Context context;

  m(Context paramContext, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(125779);
    this.context = null;
    this.cbC = 0;
    this.cbD = null;
    this.context = paramContext;
    this.cbC = ((int)(System.currentTimeMillis() / 1000L));
    this.cbD = paramJSONObject;
    AppMethodBeat.o(125779);
  }

  final JSONObject toJSONObject()
  {
    AppMethodBeat.i(125780);
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      localJSONObject1.put("ky", "AVF4T76RVR81");
      localJSONObject1.put("et", 2);
      localJSONObject1.put("ts", this.cbC);
      localJSONObject1.put("si", this.cbC);
      s.a(localJSONObject1, "ui", s.getImei(this.context));
      s.a(localJSONObject1, "mc", s.aK(this.context));
      localObject1 = i.aG(this.context).zS();
      if (s.cp((String)localObject1))
      {
        localJSONObject1.put("mid", localObject1);
        localObject1 = new com/tencent/c/a/a/b;
        ((b)localObject1).<init>(this.context);
        localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
      }
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        Object localObject1;
        JSONObject localJSONObject2;
        if (b.cbd != null)
        {
          b.a locala = b.cbd;
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>(String.valueOf(locala.cbh.widthPixels));
          localJSONObject2.put("sr", "*" + locala.cbh.heightPixels);
          s.a(localJSONObject2, "av", locala.appVersion);
          s.a(localJSONObject2, "ch", locala.channel);
          s.a(localJSONObject2, "mf", locala.cbj);
          s.a(localJSONObject2, "sv", locala.cbg);
          s.a(localJSONObject2, "ov", Integer.toString(locala.cbi));
          localJSONObject2.put("os", 1);
          s.a(localJSONObject2, "op", locala.cbk);
          s.a(localJSONObject2, "lg", locala.aOt);
          s.a(localJSONObject2, "md", locala.model);
          s.a(localJSONObject2, "tz", locala.timezone);
          if (locala.cbm != 0)
            localJSONObject2.put("jb", locala.cbm);
          s.a(localJSONObject2, "sd", locala.cbl);
          s.a(localJSONObject2, "apn", locala.packageName);
          if (s.aJ(locala.ctx))
          {
            localObject2 = new org/json/JSONObject;
            ((JSONObject)localObject2).<init>();
            s.a((JSONObject)localObject2, "bs", s.aL(locala.ctx));
            s.a((JSONObject)localObject2, "ss", s.aM(locala.ctx));
            if (((JSONObject)localObject2).length() > 0)
              s.a(localJSONObject2, "wf", ((JSONObject)localObject2).toString());
          }
          localObject2 = s.aN(locala.ctx);
          if ((localObject2 != null) && (((JSONArray)localObject2).length() > 0))
            s.a(localJSONObject2, "wflist", ((JSONArray)localObject2).toString());
          s.a(localJSONObject2, "ram", locala.cbn);
          s.a(localJSONObject2, "rom", locala.cbo);
          s.a(localJSONObject2, "im", locala.imsi);
        }
        s.a(localJSONObject2, "cn", ((b)localObject1).cbf);
        if (((b)localObject1).cbe != null)
          localJSONObject2.put("tn", ((b)localObject1).cbe);
        localJSONObject1.put("ev", localJSONObject2);
        if (this.cbD != null)
          localJSONObject1.put("ext", this.cbD);
        while (true)
        {
          AppMethodBeat.o(125780);
          return localJSONObject1;
          localJSONObject1.put("mid", "0");
          break;
          localThrowable1 = localThrowable1;
          s.zY();
        }
      }
      catch (Throwable localThrowable2)
      {
        while (true)
          s.zY();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.m
 * JD-Core Version:    0.6.2
 */