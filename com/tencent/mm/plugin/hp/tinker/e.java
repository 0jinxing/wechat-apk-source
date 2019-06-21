package com.tencent.mm.plugin.hp.tinker;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import java.io.File;
import java.util.List;

public final class e extends com.tencent.tinker.lib.d.b
{
  public e(Context paramContext)
  {
    super(paramContext);
  }

  public final void a(File paramFile, SharePatchInfo paramSharePatchInfo, String paramString)
  {
    AppMethodBeat.i(90657);
    super.a(paramFile, paramSharePatchInfo, paramString);
    com.tencent.mm.plugin.hp.b.b.bGh();
    AppMethodBeat.o(90657);
  }

  public final void a(File paramFile1, File paramFile2, String paramString, int paramInt)
  {
    AppMethodBeat.i(90656);
    super.a(paramFile1, paramFile2, paramString, paramInt);
    com.tencent.mm.plugin.hp.b.b.xb(paramInt);
    AppMethodBeat.o(90656);
  }

  public final void a(File paramFile, String paramString1, String paramString2)
  {
    AppMethodBeat.i(90653);
    super.a(paramFile, paramString1, paramString2);
    com.tencent.mm.plugin.hp.b.b.bGg();
    AppMethodBeat.o(90653);
  }

  public final void a(File paramFile, Throwable paramThrowable)
  {
    AppMethodBeat.i(90652);
    super.a(paramFile, paramThrowable);
    com.tencent.mm.plugin.hp.b.b.h(paramThrowable);
    AppMethodBeat.o(90652);
  }

  public final void a(File paramFile, List<File> paramList, Throwable paramThrowable)
  {
    AppMethodBeat.i(90651);
    super.a(paramFile, paramList, paramThrowable);
    com.tencent.mm.plugin.hp.b.b.i(paramThrowable);
    AppMethodBeat.o(90651);
  }

  public final void a(File paramFile, boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(90655);
    super.a(paramFile, paramBoolean, paramLong);
    ab.i("Tinker.TinkerPatchReporter", "onPatchResult start");
    com.tencent.mm.plugin.hp.b.b.r(paramLong, paramBoolean);
    ab.dou();
    AppMethodBeat.o(90655);
  }

  public final void ad(Intent paramIntent)
  {
    AppMethodBeat.i(90650);
    super.ad(paramIntent);
    com.tencent.mm.plugin.hp.b.b.ac(paramIntent);
    AppMethodBeat.o(90650);
  }

  public final void e(File paramFile, int paramInt)
  {
    AppMethodBeat.i(90654);
    super.e(paramFile, paramInt);
    com.tencent.mm.plugin.hp.b.b.xa(paramInt);
    AppMethodBeat.o(90654);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.e
 * JD-Core Version:    0.6.2
 */