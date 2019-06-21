package com.tencent.mm.emoji.a;

import a.f.a.a;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/model/EmojiStorageState;", "", "()V", "KVName", "", "KeyCaptureFull", "KeyCaptureSize", "KeyCustomFull", "KeyCustomSize", "KeySync", "TAG", "checkSize", "", "getKV", "Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "init", "isCaptureFull", "", "isCustomFull", "setCaptureFull", "full", "setCustomFull", "plugin-emojisdk_release"})
public final class b
{
  private static final String TAG = "MicroMsg.EmojiStorageState";
  private static final String eyC = "emoji_stg";
  public static final b eyD;

  static
  {
    AppMethodBeat.i(63244);
    eyD = new b();
    TAG = "MicroMsg.EmojiStorageState";
    eyC = "emoji_stg";
    AppMethodBeat.o(63244);
  }

  public static as OE()
  {
    AppMethodBeat.i(63239);
    as localas = as.amF(eyC);
    j.o(localas, "MultiProcessMMKV.getMMKV(KVName)");
    AppMethodBeat.o(63239);
    return localas;
  }

  public static boolean OF()
  {
    AppMethodBeat.i(63240);
    boolean bool = OE().getBoolean("capture_full", false);
    AppMethodBeat.o(63240);
    return bool;
  }

  public static void OG()
  {
    AppMethodBeat.i(63243);
    com.tencent.mm.ab.b.a("EmojiStorageState_checkSize", (a)b.a.eyE);
    AppMethodBeat.o(63243);
  }

  public static void ce(boolean paramBoolean)
  {
    AppMethodBeat.i(63241);
    OE().putBoolean("custom_full", paramBoolean);
    if ((paramBoolean) && (OE().getInt("normal_custom_size", 0) < e.OM()))
      ab.w(TAG, "custom state mismatch!");
    AppMethodBeat.o(63241);
  }

  public static void cf(boolean paramBoolean)
  {
    AppMethodBeat.i(63242);
    OE().putBoolean("capture_full", paramBoolean);
    if ((paramBoolean) && (OE().getInt("capture_custom_size", 0) < e.ON()))
      ab.w(TAG, "capture state mismatch!");
    AppMethodBeat.o(63242);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.a.b
 * JD-Core Version:    0.6.2
 */