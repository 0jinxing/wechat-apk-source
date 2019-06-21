package com.tencent.mm.plugin.appbrand.widget.b;

import android.app.Dialog;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ipcinvoker.wx_extension.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cki;
import com.tencent.mm.protocal.protobuf.ckj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class f
{
  public static final String TAG;
  public String appId;
  public String csu;
  public String cvF;
  public Dialog dialog;
  public boolean jcd = false;
  private int jce = 0;
  public TextView jcf;
  public RatingBar jcg;
  public TextView jch;
  public FrameLayout jci;
  public LinearLayout jcj;
  public int scene;
  public String userName;

  static
  {
    AppMethodBeat.i(134274);
    TAG = "MicroMsg.AppBrand.Evaluate." + f.class.getSimpleName();
    AppMethodBeat.o(134274);
  }

  private void a(cki paramcki)
  {
    AppMethodBeat.i(134265);
    b.a locala = new b.a();
    locala.fsI = 2521;
    locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/updateevaluate";
    locala.fsJ = paramcki;
    locala.fsK = new ckj();
    b.a(locala.acD(), new f.11(this));
    AppMethodBeat.o(134265);
  }

  private void qw(int paramInt)
  {
    int i = 2131296623;
    AppMethodBeat.i(134266);
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      this.jch.setText(j);
      AppMethodBeat.o(134266);
      return;
      j = 2131296625;
      continue;
      j = 2131296624;
      continue;
      j = 2131296622;
      continue;
      j = 2131296621;
    }
  }

  public final void dismiss()
  {
    AppMethodBeat.i(134267);
    if (this.dialog != null)
    {
      this.dialog.dismiss();
      this.dialog = null;
    }
    AppMethodBeat.o(134267);
  }

  public final void dp(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134268);
    if (bo.isNullOrNil(this.appId))
    {
      ab.e(TAG, "operateReport, no app id");
      AppMethodBeat.o(134268);
    }
    while (true)
    {
      return;
      ab.i(TAG, "operateReport, appId:%s, eventId:%s, session:%s, score:%s, scene:%s, result:%s, path:%s", new Object[] { this.appId, Integer.valueOf(paramInt1), this.cvF, Integer.valueOf(this.jce), Integer.valueOf(this.scene), Integer.valueOf(paramInt2), this.csu });
      h.pYm.e(16176, new Object[] { this.appId, Integer.valueOf(paramInt1), Long.valueOf(bo.anT()), Integer.valueOf(this.jce), this.cvF, this.csu, Integer.valueOf(this.scene), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(134268);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.f
 * JD-Core Version:    0.6.2
 */