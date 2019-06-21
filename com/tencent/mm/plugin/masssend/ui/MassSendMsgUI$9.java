package com.tencent.mm.plugin.masssend.ui;

import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.masssend.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class MassSendMsgUI$9
  implements AppPanel.a
{
  MassSendMsgUI$9(MassSendMsgUI paramMassSendMsgUI)
  {
  }

  public final void b(f paramf)
  {
  }

  public final void bNO()
  {
    AppMethodBeat.i(22834);
    Toast.makeText(this.opf, this.opf.getString(2131301417), 0).show();
    AppMethodBeat.o(22834);
  }

  public final void bNP()
  {
    AppMethodBeat.i(22835);
    Toast.makeText(this.opf, this.opf.getString(2131301399), 0).show();
    AppMethodBeat.o(22835);
  }

  public final void bNQ()
  {
    AppMethodBeat.i(22836);
    Toast.makeText(this.opf, this.opf.getString(2131301415), 0).show();
    AppMethodBeat.o(22836);
  }

  public final void bNR()
  {
    AppMethodBeat.i(22837);
    Toast.makeText(this.opf, this.opf.getString(2131301408), 0).show();
    AppMethodBeat.o(22837);
  }

  public final void bNS()
  {
    AppMethodBeat.i(22838);
    Toast.makeText(this.opf, this.opf.getString(2131301399), 0).show();
    AppMethodBeat.o(22838);
  }

  public final void bNT()
  {
    AppMethodBeat.i(22840);
    a.gkE.bj(this.opf);
    AppMethodBeat.o(22840);
  }

  public final void bNU()
  {
    AppMethodBeat.i(22841);
    Toast.makeText(this.opf, this.opf.getString(2131301399), 0).show();
    AppMethodBeat.o(22841);
  }

  public final void bNV()
  {
  }

  public final void bNW()
  {
    AppMethodBeat.i(22842);
    Intent localIntent = new Intent();
    localIntent.putExtra("preceding_scence", 13);
    d.b(this.opf, "emoji", ".ui.v2.EmojiStoreV2UI", localIntent);
    AppMethodBeat.o(22842);
  }

  public final void bNX()
  {
    AppMethodBeat.i(22844);
    Toast.makeText(this.opf, this.opf.getString(2131301409), 0).show();
    AppMethodBeat.o(22844);
  }

  public final void bNY()
  {
  }

  public final void bNZ()
  {
  }

  public final void bOa()
  {
  }

  public final void bOb()
  {
  }

  public final void ys(int paramInt)
  {
    AppMethodBeat.i(22839);
    switch (paramInt)
    {
    default:
    case 1:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(22839);
      while (true)
      {
        return;
        com.tencent.mm.pluginsdk.ui.tools.n.a(this.opf, 1, 1, 0, 3, null);
        AppMethodBeat.o(22839);
        continue;
        com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(e.euR);
        if ((!localb.exists()) && (!localb.mkdirs()))
        {
          Toast.makeText(this.opf, this.opf.getString(2131298250), 1).show();
          AppMethodBeat.o(22839);
        }
        else
        {
          boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this.opf.mController.ylL, "android.permission.CAMERA", 16, "", "");
          ab.i("MicroMsg.MassSendMsgUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.opf.mController.ylL });
          if (bool)
            break;
          AppMethodBeat.o(22839);
        }
      }
      MassSendMsgUI.c(this.opf);
    }
  }

  public final void yt(int paramInt)
  {
    AppMethodBeat.i(22843);
    MassSendMsgUI.d(this.opf);
    AppMethodBeat.o(22843);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.9
 * JD-Core Version:    0.6.2
 */