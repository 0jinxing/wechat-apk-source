package com.tencent.mm.plugin.card.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.List;

final class a$1
  implements g.a
{
  a$1(String paramString1, String paramString2)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(88802);
    if (paramInt == -21005)
    {
      ab.i("MicroMsg.CDNDownloadHelpper", "duplicate request, ignore this request, media id is %s", new Object[] { paramString });
      AppMethodBeat.o(88802);
    }
    while (true)
    {
      return 0;
      if (paramInt == 0)
        break;
      ab.e("MicroMsg.CDNDownloadHelpper", "start failed : %d, media id is :%s", new Object[] { Integer.valueOf(paramInt), paramString });
      for (paramInt = 0; paramInt < a.XC().size(); paramInt++)
      {
        paramString = (WeakReference)a.XC().get(paramInt);
        if (paramString != null)
        {
          paramString = (a.a)paramString.get();
          if (paramString != null)
            paramString.GS(this.fWt);
        }
      }
      AppMethodBeat.o(88802);
    }
    if (paramc != null)
    {
      ab.i("MicroMsg.CDNDownloadHelpper", "progressInfo : %s", new Object[] { paramc.toString() });
      if (paramc.field_toltalLength <= 0)
        break label454;
    }
    label454: for (int i = paramc.field_finishedLength * 100 / paramc.field_toltalLength; ; i = 0)
    {
      if (i < 0)
        paramInt = 0;
      while (true)
      {
        for (i = 0; i < a.XC().size(); i++)
        {
          paramString = (WeakReference)a.XC().get(i);
          if (paramString != null)
          {
            paramString = (a.a)paramString.get();
            if (paramString != null)
              paramString.bN(this.fWt, paramInt);
          }
        }
        paramInt = i;
        if (i > 100)
          paramInt = 100;
      }
      AppMethodBeat.o(88802);
      break;
      if (paramd != null)
      {
        if (paramd.field_retCode != 0)
        {
          ab.e("MicroMsg.CDNDownloadHelpper", "cdntra clientid:%s , sceneResult.retCode:%d , sceneResult[%s]", new Object[] { paramString, Integer.valueOf(paramd.field_retCode), paramd });
          for (paramInt = 0; paramInt < a.XC().size(); paramInt++)
          {
            paramString = (WeakReference)a.XC().get(paramInt);
            if (paramString != null)
            {
              paramString = (a.a)paramString.get();
              if (paramString != null)
                paramString.GS(this.fWt);
            }
          }
        }
        ab.i("MicroMsg.CDNDownloadHelpper", "cdn trans suceess, sceneResult[%s]", new Object[] { paramd });
        for (paramInt = 0; paramInt < a.XC().size(); paramInt++)
        {
          paramString = (WeakReference)a.XC().get(paramInt);
          if (paramString != null)
          {
            paramString = (a.a)paramString.get();
            if (paramString != null)
              paramString.dr(this.fWt, this.val$filePath);
          }
        }
      }
      AppMethodBeat.o(88802);
      break;
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    AppMethodBeat.i(88803);
    ab.i("MicroMsg.CDNDownloadHelpper", "getCdnAuthInfo, mediaId = %s", new Object[] { paramString });
    AppMethodBeat.o(88803);
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(88804);
    ab.i("MicroMsg.CDNDownloadHelpper", "decodePrepareResponse, mediaId = %s", new Object[] { paramString });
    AppMethodBeat.o(88804);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.a.1
 * JD-Core Version:    0.6.2
 */