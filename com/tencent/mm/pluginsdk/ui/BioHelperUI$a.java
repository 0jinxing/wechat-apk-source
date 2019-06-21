package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BioHelperUI$a
  implements BioHelperUI.b
{
  private BioHelperUI$a(BioHelperUI paramBioHelperUI)
  {
  }

  public final void aE(Intent paramIntent)
  {
  }

  public final String diT()
  {
    AppMethodBeat.i(125670);
    String str = this.vgV.getString(2131297628);
    AppMethodBeat.o(125670);
    return str;
  }

  public final int diU()
  {
    return 2130838641;
  }

  public final String diV()
  {
    AppMethodBeat.i(125671);
    String str = this.vgV.getString(2131297629);
    AppMethodBeat.o(125671);
    return str;
  }

  public final String diW()
  {
    AppMethodBeat.i(125672);
    String str = this.vgV.getString(2131297626);
    AppMethodBeat.o(125672);
    return str;
  }

  public final void f(int paramInt1, int paramInt2, Intent paramIntent)
  {
    paramInt1 = 0;
    AppMethodBeat.i(125674);
    boolean bool;
    if ((paramInt2 == 2) && (paramIntent != null))
    {
      this.vgV.finish();
      paramIntent = paramIntent.getStringExtra("KFaceLoginAuthPwd");
      bool = bo.isNullOrNil(paramIntent);
      if (!bo.isNullOrNil(paramIntent))
        break label75;
    }
    while (true)
    {
      ab.i("MicroMsg.BioHelperUI", "hy: secondary check onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1) });
      AppMethodBeat.o(125674);
      return;
      label75: paramInt1 = paramIntent.length();
    }
  }

  public final void fP(Context paramContext)
  {
    AppMethodBeat.i(125673);
    paramContext = new Intent();
    paramContext.putExtra("k_user_name", BioHelperUI.c(this.vgV));
    paramContext.putExtra("k_purpose", 2);
    paramContext.putExtra("k_need_signature", true);
    paramContext.putExtra("k_ticket", BioHelperUI.d(this.vgV));
    d.b(this.vgV.mController.ylL, "facedetect", ".ui.FaceDetectUI", paramContext, 1025);
    AppMethodBeat.o(125673);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.BioHelperUI.a
 * JD-Core Version:    0.6.2
 */