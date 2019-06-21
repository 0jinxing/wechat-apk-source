package com.tencent.mm.plugin.voip.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.h.b;
import com.tencent.mm.plugin.voip.model.VoipScoreState;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.e.a;

@a(3)
public class VoipScoreDialog extends MMActivity
{
  private VoipScoreState sPB;
  private ViewGroup sWL;
  private ImageView[] sWM;
  private c sWN;
  private int sWO;

  public VoipScoreDialog()
  {
    AppMethodBeat.i(4862);
    this.sWM = new ImageView[5];
    this.sWN = null;
    this.sWO = 0;
    AppMethodBeat.o(4862);
  }

  public final int getLayoutId()
  {
    return 2130971032;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(4863);
    super.onCreate(paramBundle);
    this.sPB = ((VoipScoreState)getIntent().getParcelableExtra("key_score_state"));
    if (this.sPB == null)
    {
      b.e("MicroMsg.VoipScoreDialog", "onCreate error, scoreState is null", new Object[0]);
      finish();
      AppMethodBeat.o(4863);
    }
    while (true)
    {
      return;
      this.sWL = ((ViewGroup)View.inflate(this, 2130971031, null));
      this.sWM[0] = ((ImageView)this.sWL.findViewById(2131828505));
      this.sWM[1] = ((ImageView)this.sWL.findViewById(2131828506));
      this.sWM[2] = ((ImageView)this.sWL.findViewById(2131828507));
      this.sWM[3] = ((ImageView)this.sWL.findViewById(2131828508));
      this.sWM[4] = ((ImageView)this.sWL.findViewById(2131828509));
      for (int i = 0; i < this.sWM.length; i++)
        this.sWM[i].setOnClickListener(new VoipScoreDialog.1(this, i));
      paramBundle = new e.a(this);
      paramBundle.al(this.sPB.sSM);
      paramBundle.fo(this.sWL);
      paramBundle.zQJ = getString(2131304462);
      paramBundle.b(new VoipScoreDialog.2(this));
      paramBundle.re(false);
      paramBundle.b(new VoipScoreDialog.3(this));
      this.sWN = paramBundle.gud;
      if (this.sWN != null)
      {
        this.sWN.show();
        AppMethodBeat.o(4863);
      }
      else
      {
        finish();
        AppMethodBeat.o(4863);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipScoreDialog
 * JD-Core Version:    0.6.2
 */