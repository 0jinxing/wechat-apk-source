package com.tencent.mm.plugin.ipcall.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMDotView;
import java.util.ArrayList;
import java.util.LinkedList;

public final class i extends AlertDialog
  implements ViewPager.OnPageChangeListener
{
  private CharSequence IT;
  private TextView TF;
  private View jcl;
  private MMDotView jiG;
  private Context mContext;
  private i.b nFL;
  private IPCallShareViewPager nFM;
  private View.OnClickListener nFN;
  private LinkedList<Integer> nFO;

  public final void dismiss()
  {
    AppMethodBeat.i(22356);
    try
    {
      super.dismiss();
      AppMethodBeat.o(22356);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.IPCallShareDialog", "dismiss exception, e = " + localException.getMessage());
        AppMethodBeat.o(22356);
      }
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22353);
    super.onCreate(paramBundle);
    getWindow().getAttributes().width = getWindow().getWindowManager().getDefaultDisplay().getWidth();
    getWindow().setGravity(80);
    getWindow().getDecorView().setPadding(0, 0, 0, 0);
    setContentView(this.jcl);
    AppMethodBeat.o(22353);
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(22354);
    if (this.nFL.getCount() <= 1)
    {
      this.jiG.setVisibility(4);
      AppMethodBeat.o(22354);
    }
    while (true)
    {
      return;
      this.jiG.setVisibility(0);
      this.jiG.setDotCount(this.nFL.getCount());
      this.jiG.setSelectedDot(paramInt);
      AppMethodBeat.o(22354);
    }
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null);
    for (this.IT = paramCharSequence; ; this.IT = null)
      return;
  }

  public final void show()
  {
    AppMethodBeat.i(22355);
    if ((this.nFO == null) || (this.nFO.size() == 0))
      AppMethodBeat.o(22355);
    while (true)
    {
      return;
      this.nFM.setOnPageChangeListener(this);
      i.b localb = new i.b(this);
      localb.nFP = this.nFN;
      localb.nFU = this.nFO;
      if (localb.nFU.size() > 0)
        localb.mCount = ((localb.nFU.size() - 1) / 9 + 1);
      for (int i = 0; ; i++)
      {
        if (i >= localb.mCount)
          break label256;
        View localView = ((LayoutInflater)localb.nFW.mContext.getSystemService("layout_inflater")).inflate(2130969908, null);
        GridView localGridView = (GridView)localView.findViewById(2131825194);
        ArrayList localArrayList = new ArrayList();
        int j = i * 9;
        while (true)
          if ((j < localb.nFU.size()) && (j < i * 9 + 9))
          {
            localArrayList.add(localb.nFU.get(j));
            j++;
            continue;
            localb.mCount = 0;
            break;
          }
        i.a locala = new i.a(localb.nFW.getContext());
        locala.nFP = localb.nFP;
        locala.ngC = localArrayList;
        localGridView.setAdapter(locala);
        localb.nFV.add(localView);
      }
      label256: this.nFL = localb;
      this.nFM.setAdapter(this.nFL);
      this.TF.setText(this.IT);
      super.show();
      AppMethodBeat.o(22355);
    }
  }

  public final class a$a
  {
    int id;
    RelativeLayout nFR;
    TextView nFS;
    ImageView nFT;

    public a$a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.i
 * JD-Core Version:    0.6.2
 */