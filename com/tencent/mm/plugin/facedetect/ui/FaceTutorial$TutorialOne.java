package com.tencent.mm.plugin.facedetect.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

@SuppressLint({"ValidFragment"})
public class FaceTutorial$TutorialOne extends Fragment
{
  private View kRR;
  private Button lYt;
  private WeakReference<FaceTutorial> lYu;

  public FaceTutorial$TutorialOne(FaceTutorial paramFaceTutorial)
  {
    AppMethodBeat.i(522);
    this.kRR = null;
    this.lYt = null;
    ab.i("MicroMsg.FaceTutorialUI.TutorialTwo", "hy: TutorialTwo constructed");
    this.lYu = new WeakReference(paramFaceTutorial);
    AppMethodBeat.o(522);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(524);
    ab.i("MicroMsg.FaceTutorialUI.TutorialTwo", "carson: onCreate");
    super.onCreate(paramBundle);
    AppMethodBeat.o(524);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    AppMethodBeat.i(523);
    ab.i("MicroMsg.FaceTutorialUI.TutorialTwo", "carson: onCreateView()");
    this.kRR = paramLayoutInflater.inflate(2130969481, paramViewGroup, false);
    this.lYt = ((Button)this.kRR.findViewById(2131823839));
    this.lYt.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(521);
        if (FaceTutorial.TutorialOne.a(FaceTutorial.TutorialOne.this).get() != null)
        {
          paramAnonymousView = (FaceTutorial)FaceTutorial.TutorialOne.a(FaceTutorial.TutorialOne.this).get();
          if (paramAnonymousView.lYq != null)
            paramAnonymousView.lYq.btp();
          paramAnonymousView.dismiss();
          AppMethodBeat.o(521);
        }
        while (true)
        {
          return;
          ab.e("MicroMsg.FaceTutorialUI.TutorialTwo", "hy: lost tutorial instance");
          AppMethodBeat.o(521);
        }
      }
    });
    paramLayoutInflater = this.kRR;
    AppMethodBeat.o(523);
    return paramLayoutInflater;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(525);
    super.onDestroy();
    ab.i("MicroMsg.FaceTutorialUI.TutorialTwo", "hy: TutorialTwo onDestroy");
    AppMethodBeat.o(525);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceTutorial.TutorialOne
 * JD-Core Version:    0.6.2
 */