package com.tencent.mm.emoji.loader.c;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/fetcher/EmojiFetcher$Companion;", "", "()V", "CDN_MEDIA_PREFIX", "", "getCDN_MEDIA_PREFIX", "()Ljava/lang/String;", "ENCRYPT_SUFFIX", "getENCRYPT_SUFFIX", "EXTERN_SUFFIX", "getEXTERN_SUFFIX", "FetcherTypeEncrypt", "", "FetcherTypeExternal", "FetcherTypeOpenIm", "FetcherTypeOrigin", "OPENIM_SUFFIX", "getOPENIM_SUFFIX", "plugin-emojisdk_release"})
public final class c$a
{
  private static final String exK = "_openim";
  private static final String exL = "_extern";
  private static final String exM = "_encrypt";
  private static final String exN = "downemoji_";

  static
  {
    AppMethodBeat.i(63180);
    exO = new a();
    exK = "_openim";
    exL = "_extern";
    exM = "_encrypt";
    exN = "downemoji_";
    AppMethodBeat.o(63180);
  }

  public static String Ox()
  {
    return exN;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.c.c.a
 * JD-Core Version:    0.6.2
 */