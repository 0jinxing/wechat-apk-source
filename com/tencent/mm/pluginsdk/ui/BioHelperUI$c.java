package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class BioHelperUI$c
  implements BioHelperUI.b
{
  private int gOW;

  private BioHelperUI$c(BioHelperUI paramBioHelperUI)
  {
  }

  public final void aE(Intent paramIntent)
  {
    AppMethodBeat.i(125675);
    if (paramIntent == null)
      AppMethodBeat.o(125675);
    while (true)
    {
      return;
      this.gOW = paramIntent.getIntExtra("kscene_type", 73);
      AppMethodBeat.o(125675);
    }
  }

  public final String diT()
  {
    AppMethodBeat.i(125676);
    String str = this.vgV.getString(2131297632);
    AppMethodBeat.o(125676);
    return str;
  }

  public final int diU()
  {
    return 2130840539;
  }

  public final String diV()
  {
    AppMethodBeat.i(125677);
    String str = this.vgV.getString(2131297631);
    AppMethodBeat.o(125677);
    return str;
  }

  public final String diW()
  {
    AppMethodBeat.i(125678);
    String str = this.vgV.getString(2131297627);
    AppMethodBeat.o(125678);
    return str;
  }

  public final void f(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    AppMethodBeat.i(125680);
    String str;
    boolean bool;
    if (paramInt2 == -1)
      if ((paramInt1 == 1024) && (paramIntent != null))
      {
        str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
        bool = bo.isNullOrNil(str);
        if (!bo.isNullOrNil(str))
          break label129;
      }
    label129: for (paramInt1 = i; ; paramInt1 = str.length())
    {
      ab.d("MicroMsg.BioHelperUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1) });
      paramIntent = new Intent();
      paramIntent.putExtra("VoiceLoginAuthPwd", str);
      paramIntent.putExtra("KVoiceHelpCode", BioHelperUI.e(this.vgV));
      this.vgV.setResult(-1, paramIntent);
      this.vgV.finish();
      AppMethodBeat.o(125680);
      return;
    }
  }

  public final void fP(Context paramContext)
  {
    AppMethodBeat.i(125679);
    Intent localIntent = new Intent();
    localIntent.putExtra("kscene_type", this.gOW);
    localIntent.putExtra("Kusername", BioHelperUI.c(this.vgV));
    localIntent.putExtra("Kvertify_key", BioHelperUI.d(this.vgV));
    d.b(paramContext, "voiceprint", ".ui.VoiceLoginUI", localIntent, 1024);
    AppMethodBeat.o(125679);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.BioHelperUI.c
 * JD-Core Version:    0.6.2
 */