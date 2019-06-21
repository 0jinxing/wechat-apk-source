package com.tencent.mm.plugin.clean.ui.newui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.clean.c.b;
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.plugin.clean.c.e;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CleanChattingUI extends MMActivity
  implements com.tencent.mm.plugin.clean.c.h
{
  private ProgressDialog ehJ;
  private Button gzI;
  private TextView jux;
  private View kxA;
  private CheckBox kxB;
  private ListView kxI;
  private TextView kxJ;
  private e kyL;
  private a kyO;

  public final void a(HashSet<Integer> paramHashSet)
  {
    AppMethodBeat.i(18881);
    HashSet localHashSet = new HashSet();
    Iterator localIterator = paramHashSet.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      int j = ((Integer)localIterator.next()).intValue();
      if (j < d.bfS().size())
      {
        long l = i;
        i = (int)(((b)d.bfS().get(j)).jrb + l);
      }
      else
      {
        localHashSet.add(Integer.valueOf(j));
      }
    }
    localIterator = localHashSet.iterator();
    while (localIterator.hasNext())
      paramHashSet.remove((Integer)localIterator.next());
    if ((paramHashSet.size() != 0) || (i > 0))
    {
      this.kxJ.setText(getString(2131298867, new Object[] { bo.ga(i) }));
      this.gzI.setEnabled(true);
      if (paramHashSet.size() == this.kyO.getCount())
      {
        this.kxB.setChecked(true);
        AppMethodBeat.o(18881);
      }
    }
    while (true)
    {
      return;
      this.kxB.setChecked(false);
      AppMethodBeat.o(18881);
      continue;
      this.kxJ.setText("");
      this.gzI.setEnabled(false);
      this.kxB.setChecked(false);
      AppMethodBeat.o(18881);
    }
  }

  public final void dP(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18883);
    this.ehJ.setMessage(getString(2131298315, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
    AppMethodBeat.o(18883);
  }

  public final int getLayoutId()
  {
    return 2130969144;
  }

  public final void hi(long paramLong)
  {
    AppMethodBeat.i(18884);
    this.ehJ.dismiss();
    d.hg(d.bfW() + paramLong);
    d.hd(d.bfT() - paramLong);
    com.tencent.mm.ui.base.h.a(this, getString(2131298296, new Object[] { bo.ga(paramLong) }), "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(18879);
        if ((d.bfS() != null) && (d.bfS().size() == 0))
          CleanChattingUI.this.finish();
        AppMethodBeat.o(18879);
      }
    });
    AppMethodBeat.o(18884);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(18885);
    this.kyO.notifyDataSetChanged();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(18885);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18880);
    super.onCreate(paramBundle);
    d.bfZ();
    ab.i("MicroMsg.CleanChattingUI", "Create!!");
    setMMTitle(2131298323);
    this.kxI = ((ListView)findViewById(2131822774));
    this.kyO = new a(this);
    this.kxI.setAdapter(this.kyO);
    this.kxI.setEmptyView(findViewById(2131821604));
    this.kxA = findViewById(2131821612);
    this.kxJ = ((TextView)findViewById(2131822773));
    this.kxB = ((CheckBox)findViewById(2131821610));
    this.jux = ((TextView)findViewById(2131821611));
    if (!aa.don())
    {
      this.kxJ.setTextSize(1, 14.0F);
      this.jux.setTextSize(1, 14.0F);
    }
    this.gzI = ((Button)findViewById(2131822772));
    this.gzI.setEnabled(false);
    setBackBtn(new CleanChattingUI.1(this));
    this.kxI.setOnItemClickListener(new CleanChattingUI.2(this));
    this.gzI.setOnClickListener(new CleanChattingUI.3(this));
    this.kxA.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(18878);
        paramAnonymousView = CleanChattingUI.b(CleanChattingUI.this);
        if (paramAnonymousView.jur.size() == paramAnonymousView.getCount())
          paramAnonymousView.jur.clear();
        while (true)
        {
          paramAnonymousView.notifyDataSetChanged();
          paramAnonymousView.kyF.a(paramAnonymousView.jur);
          AppMethodBeat.o(18878);
          return;
          for (int i = 0; i < paramAnonymousView.getCount(); i++)
            paramAnonymousView.jur.add(Integer.valueOf(i));
        }
      }
    });
    getString(2131297061);
    this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131298295), false, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
      }
    });
    this.ehJ.dismiss();
    AppMethodBeat.o(18880);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(18882);
    if (this.ehJ.isShowing())
      this.ehJ.dismiss();
    if (this.kyL != null)
      this.kyL.bgb();
    d.bga();
    d.bfY();
    super.onDestroy();
    AppMethodBeat.o(18882);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanChattingUI
 * JD-Core Version:    0.6.2
 */