package com.tencent.mm.compatible.e;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Map;

public final class w
{
  public static boolean etQ = false;
  public String etR = "";
  Map<String, String> etS = null;
  private int etT = 0;

  public static boolean Md()
  {
    boolean bool = false;
    if (etQ)
    {
      etQ = false;
      bool = true;
    }
    return bool;
  }

  public final void f(Map<String, String> paramMap)
  {
    this.etS = paramMap;
  }

  public final void iT(int paramInt)
  {
    AppMethodBeat.i(93016);
    this.etT = paramInt;
    etQ = true;
    SharedPreferences.Editor localEditor = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "system_config_prefs", 4).edit();
    localEditor.putInt("update_swip_back_status", paramInt);
    localEditor.commit();
    ab.v("MicroMsg.ManuFacturerInfo", "update mSwipBackStatus(%s)", new Object[] { Integer.valueOf(this.etT) });
    AppMethodBeat.o(93016);
  }

  public final void kv(String paramString)
  {
    this.etR = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.w
 * JD-Core Version:    0.6.2
 */