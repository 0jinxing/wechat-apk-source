package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CleanChattingUI extends MMActivity
  implements com.tencent.mm.plugin.clean.c.h
{
  private List<c> dataList;
  private ProgressDialog ehJ;
  private Button gzI;
  private TextView jux;
  private View kxA;
  private CheckBox kxB;
  private a kxH;
  private ListView kxI;
  private TextView kxJ;
  private TextView kxK;
  private boolean kxL;

  public CleanChattingUI()
  {
    AppMethodBeat.i(18788);
    this.kxL = false;
    this.dataList = new ArrayList();
    AppMethodBeat.o(18788);
  }

  public final void a(HashSet<Integer> paramHashSet)
  {
    AppMethodBeat.i(18790);
    if (this.kxH == null)
    {
      ab.w("MicroMsg.CleanChattingUI", "on click check box but adapter is null");
      AppMethodBeat.o(18790);
    }
    while (true)
    {
      return;
      HashSet localHashSet = new HashSet();
      Iterator localIterator = paramHashSet.iterator();
      long l = 0L;
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        localObject = this.kxH.tu(i);
        if (localObject != null)
          l = ((c)localObject).size + l;
        else
          localHashSet.add(Integer.valueOf(i));
      }
      Object localObject = localHashSet.iterator();
      while (((Iterator)localObject).hasNext())
        paramHashSet.remove((Integer)((Iterator)localObject).next());
      if ((paramHashSet.size() != 0) || (l > 0L))
      {
        this.kxJ.setText(getString(2131298867, new Object[] { bo.ga(l) }));
        this.gzI.setEnabled(true);
        if (paramHashSet.size() == this.kxH.getCount())
        {
          this.kxB.setChecked(true);
          AppMethodBeat.o(18790);
        }
        else
        {
          this.kxB.setChecked(false);
          AppMethodBeat.o(18790);
        }
      }
      else
      {
        this.kxJ.setText("");
        this.gzI.setEnabled(false);
        this.kxB.setChecked(false);
        AppMethodBeat.o(18790);
      }
    }
  }

  public final void dP(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18793);
    al.d(new CleanChattingUI.7(this, paramInt1, paramInt2));
    AppMethodBeat.o(18793);
  }

  public final int getLayoutId()
  {
    return 2130969144;
  }

  public final void hi(long paramLong)
  {
    AppMethodBeat.i(18794);
    ab.i("MicroMsg.CleanChattingUI", "%s onDeleteEnd [%d] ", new Object[] { hashCode(), Long.valueOf(paramLong) });
    j.bgd().kvW -= paramLong;
    j.bgd().kvV -= paramLong;
    al.d(new CleanChattingUI.8(this, paramLong));
    AppMethodBeat.o(18794);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(18795);
    long l;
    c localc;
    if (paramIntent != null)
    {
      int i = paramIntent.getIntExtra("key_pos", -1);
      l = paramIntent.getLongExtra("key_delete_size", 0L);
      if ((i >= 0) && (i < this.dataList.size()))
      {
        localc = (c)this.dataList.get(i);
        if (localc != null)
        {
          if (localc.size != l)
            break label121;
          this.dataList.remove(i);
          this.kxH.bgh();
        }
      }
    }
    while (true)
    {
      this.kxH.notifyDataSetChanged();
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(18795);
      return;
      label121: localc.size -= l;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18789);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.CleanChattingUI", "Create!!");
    setMMTitle(2131298308);
    this.kxI = ((ListView)findViewById(2131822774));
    this.kxH = new a(this, this.dataList);
    this.kxI.setAdapter(this.kxH);
    this.kxI.setEmptyView(findViewById(2131821604));
    this.kxK = ((TextView)findViewById(2131821499));
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
    this.kxA.setOnClickListener(new CleanChattingUI.4(this));
    getString(2131297061);
    this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131298295), false, new CleanChattingUI.5(this));
    this.ehJ.dismiss();
    com.tencent.mm.plugin.report.service.h.pYm.a(714L, 20L, 1L, false);
    AppMethodBeat.o(18789);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(18791);
    if (this.ehJ.isShowing())
      this.ehJ.dismiss();
    super.onDestroy();
    AppMethodBeat.o(18791);
  }

  public void onResume()
  {
    AppMethodBeat.i(18792);
    super.onResume();
    if ((this.kxH != null) && (this.dataList.isEmpty()))
      g.RS().aa(new CleanChattingUI.6(this));
    AppMethodBeat.o(18792);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingUI
 * JD-Core Version:    0.6.2
 */