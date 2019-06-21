package com.tencent.mm.loader.e.c;

import a.l;
import com.tencent.mm.loader.d.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder;", "RESOURCE", "Lcom/tencent/mm/loader/common/ITranscoderProducer;", "()V", "nextTransCoder", "getNextTransCoder$libimageloader_release", "()Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder;", "setNextTransCoder$libimageloader_release", "(Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder;)V", "priority", "Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder$PRIORITY;", "getPriority$libimageloader_release", "()Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder$PRIORITY;", "setPriority$libimageloader_release", "(Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder$PRIORITY;)V", "whenIf", "Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder$WHENIF;", "getWhenIf$libimageloader_release", "()Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder$WHENIF;", "setWhenIf$libimageloader_release", "(Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder$WHENIF;)V", "append", "next", "whenDecode", "whenDownload", "whenLoad", "PRIORITY", "WHENIF", "libimageloader_release"})
public abstract class b<RESOURCE>
  implements f<RESOURCE, RESOURCE>
{
  public b<?> eQG;
  public b.a eQH = b.a.eQK;
  public b eQI = b.eQN;

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder$WHENIF;", "", "(Ljava/lang/String;I)V", "LOADED", "DECODED", "DOWNLOADED", "libimageloader_release"})
  public static enum b
  {
    static
    {
      b localb1 = new b("LOADED", 0);
      eQN = localb1;
      b localb2 = new b("DECODED", 1);
      eQO = localb2;
      b localb3 = new b("DOWNLOADED", 2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e.c.b
 * JD-Core Version:    0.6.2
 */