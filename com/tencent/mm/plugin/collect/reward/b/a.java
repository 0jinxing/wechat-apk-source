package com.tencent.mm.plugin.collect.reward.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class a
  implements g.a
{
  private static final String kDC;
  private static a kDD;
  private String filename;
  public Map<String, a.a> jxd;

  static
  {
    AppMethodBeat.i(41061);
    kDC = com.tencent.mm.loader.j.b.eSj + "wallet/img/";
    AppMethodBeat.o(41061);
  }

  public static a bgS()
  {
    AppMethodBeat.i(41055);
    if (kDD == null)
      kDD = new a();
    a locala = kDD;
    AppMethodBeat.o(41055);
    return locala;
  }

  private String bgU()
  {
    AppMethodBeat.i(41058);
    if (bo.isNullOrNil(this.filename))
      this.filename = ag.ck(r.Yz() + "_reward_img");
    String str = this.filename;
    AppMethodBeat.o(41058);
    return str;
  }

  public final int a(final String paramString, final int paramInt, com.tencent.mm.i.c paramc, final d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(41060);
    ab.i("MicroMsg.QrRewardCdnDownloadHelper", "cdn callback, id: %s, ret: %s, sceneResult: %s", new Object[] { paramString, Integer.valueOf(paramInt), paramd });
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(41054);
        a.a locala = (a.a)a.a(a.this).get(paramString);
        if (locala != null)
          if (paramd != null)
          {
            int i = paramd.field_retCode;
            locala.P(paramString, paramInt, i);
            a.a(a.this).remove(paramString);
            if (paramd.field_retCode == 0)
            {
              h.pYm.a(724L, 8L, 1L, false);
              AppMethodBeat.o(41054);
            }
          }
        while (true)
        {
          return;
          h.pYm.a(724L, 9L, 1L, false);
          AppMethodBeat.o(41054);
          continue;
          ab.v("MicroMsg.QrRewardCdnDownloadHelper", "download is not end");
          AppMethodBeat.o(41054);
          continue;
          ab.w("MicroMsg.QrRewardCdnDownloadHelper", "no callback");
          AppMethodBeat.o(41054);
        }
      }
    });
    AppMethodBeat.o(41060);
    return 0;
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final boolean a(String paramString1, String paramString2, a.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(41056);
    ab.i("MicroMsg.QrRewardCdnDownloadHelper", "downloadImage. imageId:%s", new Object[] { paramString1 });
    Object localObject = new File(kDC);
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    localObject = new g();
    ((g)localObject).cRY = false;
    ((g)localObject).egl = this;
    ((g)localObject).field_fullpath = (kDC + bgU());
    ((g)localObject).field_mediaId = bo.nullAsNil(com.tencent.mm.al.c.a("QrRewardImg", bo.anU(), r.Zd().field_username, ""));
    ((g)localObject).field_fileId = paramString1;
    ((g)localObject).field_aesKey = paramString2;
    ((g)localObject).field_fileType = com.tencent.mm.i.a.MediaType_FILE;
    ((g)localObject).field_priority = com.tencent.mm.i.a.efC;
    ((g)localObject).field_needStorage = false;
    ((g)localObject).field_isStreamMedia = false;
    ((g)localObject).field_appType = 0;
    ((g)localObject).field_bzScene = 0;
    if (this.jxd == null)
      this.jxd = new HashMap();
    this.jxd.put(((g)localObject).field_mediaId, parama);
    if (!f.afx().b((g)localObject, -1))
    {
      ab.e("MicroMsg.QrRewardCdnDownloadHelper", "ljd: cdntra addSendTask failed. imageId:%s", new Object[] { paramString1 });
      AppMethodBeat.o(41056);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(41056);
      bool = true;
    }
  }

  public final boolean bgT()
  {
    AppMethodBeat.i(41057);
    boolean bool = new File(kDC + bgU()).exists();
    AppMethodBeat.o(41057);
    return bool;
  }

  public final String bgV()
  {
    AppMethodBeat.i(41059);
    String str = kDC + bgU();
    AppMethodBeat.o(41059);
    return str;
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.b.a
 * JD-Core Version:    0.6.2
 */