package com.tencent.smtt.sdk;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;
import java.util.HashMap;
import java.util.Map;

class am
{
  public boolean a;
  public boolean b;
  private Map<String, String> c;

  public am()
  {
    AppMethodBeat.i(64391);
    this.a = false;
    this.b = false;
    this.c = null;
    this.c = new HashMap();
    AppMethodBeat.o(64391);
  }

  public void a(String paramString, byte paramByte)
  {
    while (true)
    {
      String str;
      try
      {
        AppMethodBeat.i(64392);
        if (TextUtils.isEmpty(paramString))
        {
          AppMethodBeat.o(64392);
          return;
        }
        str = "";
        if (paramByte == 1)
        {
          str = "_begin";
          Map localMap = this.c;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localMap.put(paramString + str, String.valueOf(System.currentTimeMillis()));
          AppMethodBeat.o(64392);
          continue;
        }
      }
      finally
      {
      }
      if (paramByte == 2)
        str = "_end";
    }
  }

  public void a(String paramString, long paramLong)
  {
    try
    {
      AppMethodBeat.i(64393);
      if (TextUtils.isEmpty(paramString))
        AppMethodBeat.o(64393);
      while (true)
      {
        return;
        this.c.put(paramString, String.valueOf(paramLong));
        AppMethodBeat.o(64393);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public boolean a(int paramInt, String paramString)
  {
    boolean bool = true;
    while (true)
    {
      try
      {
        AppMethodBeat.i(64394);
        Object localObject = bv.a();
        if (((bv)localObject).b())
        {
          if (((!this.b) || (!this.a)) && (System.currentTimeMillis() % 10L != 0L))
          {
            AppMethodBeat.o(64394);
            return bool;
          }
          this.b = true;
          this.a = true;
          this.c.put("is_first_init_tbs", String.valueOf(this.b));
          this.c.put("is_first_init_x5", String.valueOf(this.a));
          this.c.put("x5_webview_id", Integer.toString(paramInt));
          this.c.put("current_url", paramString);
          if ((QbSdk.n != null) && (QbSdk.n.containsKey("app_scene_id")))
          {
            localMap = this.c;
            paramString = new java/lang/StringBuilder;
            paramString.<init>();
            localMap.put("app_scene_id", QbSdk.n.get("app_scene_id"));
          }
          paramString = ((bv)localObject).c().b();
          localObject = Integer.TYPE;
          Map localMap = this.c;
          paramString.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "setTbsInitPerformanceData", new Class[] { localObject, Map.class }, new Object[] { Integer.valueOf(paramInt), localMap });
          AppMethodBeat.o(64394);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(64394);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.am
 * JD-Core Version:    0.6.2
 */