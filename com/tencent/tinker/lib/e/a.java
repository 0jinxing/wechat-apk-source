package com.tencent.tinker.lib.e;

import android.content.Context;
import com.tencent.tinker.lib.d.c;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import java.io.File;

public class a
{
  private static a ABA;
  public static boolean ABB = false;
  public final File ABC;
  final com.tencent.tinker.lib.b.b ABD;
  public final c ABE;
  public final com.tencent.tinker.lib.d.d ABF;
  public final File ABG;
  public final File ABH;
  public final boolean ABI;
  public d ABJ;
  public boolean ABK = false;
  public final Context context;
  public final boolean rNw;
  public int tinkerFlags;
  final boolean tinkerLoadVerifyFlag;

  private a(Context paramContext, int paramInt, c paramc, com.tencent.tinker.lib.d.d paramd, com.tencent.tinker.lib.b.b paramb, File paramFile1, File paramFile2, File paramFile3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.context = paramContext;
    this.ABD = paramb;
    this.ABE = paramc;
    this.ABF = paramd;
    this.tinkerFlags = paramInt;
    this.ABC = paramFile1;
    this.ABG = paramFile2;
    this.ABH = paramFile3;
    this.rNw = paramBoolean1;
    this.tinkerLoadVerifyFlag = paramBoolean3;
    this.ABI = paramBoolean2;
  }

  public static void a(a parama)
  {
    if (ABA != null)
      throw new TinkerRuntimeException("Tinker instance is already set.");
    ABA = parama;
  }

  private void auj(String paramString)
  {
    if ((this.ABC == null) || (paramString == null));
    while (true)
    {
      return;
      SharePatchFileUtil.cu(this.ABC.getAbsolutePath() + "/" + paramString);
    }
  }

  public static a iX(Context paramContext)
  {
    if (!ABB)
      throw new TinkerRuntimeException("you must install tinker before get tinker sInstance");
    try
    {
      if (ABA == null)
      {
        a locala = new com/tencent/tinker/lib/e/a$a;
        locala.<init>(paramContext);
        ABA = locala.dSh();
      }
      return ABA;
    }
    finally
    {
    }
    throw paramContext;
  }

  public final void ak(File paramFile)
  {
    if ((this.ABC == null) || (paramFile == null) || (!paramFile.exists()));
    while (true)
    {
      return;
      auj(SharePatchFileUtil.auq(SharePatchFileUtil.at(paramFile)));
    }
  }

  public final void bGr()
  {
    if (this.ABC == null);
    while (true)
    {
      return;
      File localFile1 = SharePatchFileUtil.auo(this.ABC.getAbsolutePath());
      if (!localFile1.exists())
      {
        com.tencent.tinker.lib.util.a.w("Tinker.Tinker", "try to clean patch while patch info file does not exist.", new Object[0]);
      }
      else
      {
        File localFile2 = SharePatchFileUtil.aup(this.ABC.getAbsolutePath());
        SharePatchInfo localSharePatchInfo = SharePatchInfo.l(localFile1, localFile2);
        if (localSharePatchInfo != null)
        {
          localSharePatchInfo.AET = true;
          SharePatchInfo.a(localFile1, localSharePatchInfo, localFile2);
        }
      }
    }
  }

  public static final class a
  {
    private File ABC;
    public com.tencent.tinker.lib.b.b ABD;
    public c ABE;
    public com.tencent.tinker.lib.d.d ABF;
    private File ABG;
    private File ABH;
    private final boolean ABL;
    private final boolean ABM;
    public Boolean ABN;
    private final Context context;
    public int status = -1;

    public a(Context paramContext)
    {
      if (paramContext == null)
        throw new TinkerRuntimeException("Context must not be null.");
      this.context = paramContext;
      this.ABL = com.tencent.tinker.lib.util.b.jp(paramContext);
      this.ABM = com.tencent.tinker.lib.util.b.jb(paramContext);
      this.ABC = SharePatchFileUtil.jh(paramContext);
      if (this.ABC == null)
        com.tencent.tinker.lib.util.a.e("Tinker.Tinker", "patchDirectory is null!", new Object[0]);
      while (true)
      {
        return;
        this.ABG = SharePatchFileUtil.auo(this.ABC.getAbsolutePath());
        this.ABH = SharePatchFileUtil.aup(this.ABC.getAbsolutePath());
        com.tencent.tinker.lib.util.a.w("Tinker.Tinker", "tinker patch directory: %s", new Object[] { this.ABC });
      }
    }

    public final a dSh()
    {
      if (this.status == -1)
        this.status = 7;
      if (this.ABE == null)
        this.ABE = new com.tencent.tinker.lib.d.a(this.context);
      if (this.ABF == null)
        this.ABF = new com.tencent.tinker.lib.d.b(this.context);
      if (this.ABD == null)
        this.ABD = new com.tencent.tinker.lib.b.a(this.context);
      if (this.ABN == null)
        this.ABN = Boolean.FALSE;
      return new a(this.context, this.status, this.ABE, this.ABF, this.ABD, this.ABC, this.ABG, this.ABH, this.ABL, this.ABM, this.ABN.booleanValue(), (byte)0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.e.a
 * JD-Core Version:    0.6.2
 */