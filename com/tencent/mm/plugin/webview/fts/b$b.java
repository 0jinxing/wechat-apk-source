package com.tencent.mm.plugin.webview.fts;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.protocal.protobuf.azv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

final class b$b
{
  String cBF;
  boolean fOb = false;
  private String hPI = null;
  String lcA;
  int scene;
  int type;
  long ufA;
  long ufz;

  private b$b(b paramb)
  {
  }

  final String cWm()
  {
    AppMethodBeat.i(5683);
    if (this.hPI == null)
      this.hPI = "";
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(this.cBF);
      localObject = ((JSONObject)localObject).optJSONObject("data").optJSONObject("hotwords").optJSONArray("items");
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      for (int i = 0; i < ((JSONArray)localObject).length(); i++)
        localArrayList.add(Uri.encode(((JSONArray)localObject).optJSONObject(i).optString("hotword")));
      this.hPI = TextUtils.join("|", localArrayList);
      label100: localObject = this.hPI;
      AppMethodBeat.o(5683);
      return localObject;
    }
    catch (Exception localException)
    {
      break label100;
    }
  }

  final void gr(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5684);
    azv localazv = new azv();
    Object localObject1 = com.tencent.mm.plugin.record.b.XZ();
    Object localObject2 = b.s(paramInt1, paramInt2, false);
    if (!((String)localObject2).equals(b.s(paramInt1, paramInt2, true)))
      this.fOb = true;
    localObject1 = new File((String)localObject1, (String)localObject2);
    localObject2 = e.e(((File)localObject1).getAbsolutePath(), 0, (int)((File)localObject1).length());
    if (localObject2 != null);
    while (true)
    {
      try
      {
        localazv.parseFrom((byte[])localObject2);
        this.scene = localazv.scene;
        this.cBF = localazv.vOy;
        this.ufz = localazv.wDD;
        this.ufA = localazv.wDE;
        this.lcA = localazv.vQg;
        this.type = localazv.jCt;
        ab.i("MicroMsg.FTS.FTSWebViewLogic", "load bizCacheFile %s %d", new Object[] { ((File)localObject1).getAbsolutePath(), Integer.valueOf(localObject2.length) });
        AppMethodBeat.o(5684);
        return;
      }
      catch (IOException localIOException)
      {
      }
      AppMethodBeat.o(5684);
    }
  }

  final boolean isAvailable()
  {
    boolean bool = false;
    AppMethodBeat.i(5682);
    if (this.fOb)
      AppMethodBeat.o(5682);
    while (true)
    {
      return bool;
      if ((bo.isNullOrNil(this.cBF)) || (System.currentTimeMillis() / 1000L - this.ufA > this.ufz))
      {
        AppMethodBeat.o(5682);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(5682);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.b.b
 * JD-Core Version:    0.6.2
 */