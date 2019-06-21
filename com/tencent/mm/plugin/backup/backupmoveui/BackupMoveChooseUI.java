package com.tencent.mm.plugin.backup.backupmoveui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.f.b;
import com.tencent.mm.plugin.backup.c.b.b;
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.plugin.backup.d.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.q;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class BackupMoveChooseUI extends MMWizardActivity
{
  private static int aPA = 0;
  private static long endTime;
  private static int juK = 0;
  private static long startTime;
  private ProgressBar juA;
  private View juB;
  private LinearLayout juC;
  private LinearLayout juD;
  private LinearLayout juE;
  private LinearLayout juF;
  private TextView juG;
  private TextView juH;
  private TextView juI;
  private Button juJ;
  private SimpleDateFormat juL;
  private b.b juM;
  private a juv;
  private ListView juw;
  private TextView jux;
  private TextView juy;
  private TextView juz;

  public BackupMoveChooseUI()
  {
    AppMethodBeat.i(17329);
    this.juv = new a(this);
    this.juL = new SimpleDateFormat("yyyy.MM.dd");
    this.juM = new BackupMoveChooseUI.5(this);
    AppMethodBeat.o(17329);
  }

  private void aTt()
  {
    AppMethodBeat.i(17336);
    if ((this.juD.getVisibility() == 8) && (this.juE.getVisibility() == 8) && (this.juF.getVisibility() == 8))
    {
      this.juB.setVisibility(8);
      this.juC.setVisibility(8);
      AppMethodBeat.o(17336);
    }
    while (true)
    {
      return;
      this.juB.setVisibility(0);
      this.juC.setVisibility(0);
      AppMethodBeat.o(17336);
    }
  }

  private void fm(boolean paramBoolean)
  {
    AppMethodBeat.i(17334);
    if (paramBoolean)
    {
      b.aSZ();
      SharedPreferences localSharedPreferences = b.aSz();
      juK = localSharedPreferences.getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
      aPA = localSharedPreferences.getInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
      startTime = localSharedPreferences.getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
      endTime = localSharedPreferences.getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
    }
    switch (juK)
    {
    default:
      switch (aPA)
      {
      default:
      case 0:
      case 1:
      }
      break;
    case 0:
    case 1:
    }
    while (true)
    {
      aTt();
      AppMethodBeat.o(17334);
      return;
      this.juE.setVisibility(8);
      break;
      this.juB.setVisibility(0);
      this.juC.setVisibility(0);
      this.juE.setVisibility(0);
      this.juH.setText(this.juL.format(new Date(startTime)) + "~" + this.juL.format(new Date(endTime - 86400000L)));
      break;
      this.juF.setVisibility(8);
      continue;
      this.juB.setVisibility(0);
      this.juC.setVisibility(0);
      this.juF.setVisibility(0);
      this.juI.setText(this.mController.ylL.getResources().getString(2131297260));
    }
  }

  public final void a(HashSet<Integer> paramHashSet)
  {
    AppMethodBeat.i(17335);
    LinkedList localLinkedList = b.aSZ().aTd().aSV();
    if (localLinkedList == null)
    {
      ab.e("MicroMsg.BackupMoveChooseUI", "onClickCheckBox convInfo is null.");
      AppMethodBeat.o(17335);
      return;
    }
    Object localObject = new HashSet();
    Iterator localIterator = paramHashSet.iterator();
    long l = 0L;
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if (i < localLinkedList.size())
        l = ((f.b)localLinkedList.get(i)).jri + l;
      else
        ((HashSet)localObject).add(Integer.valueOf(i));
    }
    localObject = ((HashSet)localObject).iterator();
    while (((Iterator)localObject).hasNext())
      paramHashSet.remove((Integer)((Iterator)localObject).next());
    if ((paramHashSet.size() != 0) || (l > 0L))
    {
      this.juJ.setEnabled(true);
      if (paramHashSet.size() == this.juv.getCount())
      {
        this.jux.setText(2131297191);
        label195: this.juB.setVisibility(0);
        this.juC.setVisibility(0);
        this.juD.setVisibility(0);
        this.juG.setText(getString(2131297193, new Object[] { Integer.valueOf(paramHashSet.size()) }));
      }
    }
    while (true)
    {
      aTt();
      AppMethodBeat.o(17335);
      break;
      this.jux.setText(2131297190);
      break label195;
      this.juJ.setEnabled(false);
      this.jux.setText(2131297190);
      this.juD.setVisibility(8);
      this.juG.setText("");
    }
  }

  public final int getLayoutId()
  {
    return 2130968795;
  }

  public final void initView()
  {
    AppMethodBeat.i(17333);
    setMMTitle(2131297359);
    this.juw = ((ListView)findViewById(2131821563));
    this.juw.setAdapter(this.juv);
    this.juw.setEmptyView(findViewById(2131821564));
    this.jux = ((TextView)findViewById(2131821578));
    this.juy = ((TextView)findViewById(2131821566));
    this.juA = ((ProgressBar)findViewById(2131821565));
    this.juz = ((TextView)findViewById(2131821579));
    this.juB = findViewById(2131821567);
    this.juC = ((LinearLayout)findViewById(2131821568));
    this.juD = ((LinearLayout)findViewById(2131821569));
    this.juE = ((LinearLayout)findViewById(2131821572));
    this.juF = ((LinearLayout)findViewById(2131821575));
    this.juG = ((TextView)findViewById(2131821571));
    this.juH = ((TextView)findViewById(2131821574));
    this.juI = ((TextView)findViewById(2131821577));
    ((TextView)findViewById(2131821570)).setText(2131297201);
    ((TextView)findViewById(2131821573)).setText(2131297203);
    ((TextView)findViewById(2131821576)).setText(2131297199);
    setBackBtn(new BackupMoveChooseUI.1(this));
    this.juJ = ((Button)findViewById(2131821580));
    this.juJ.setOnClickListener(new BackupMoveChooseUI.2(this));
    this.juJ.setEnabled(false);
    fm(true);
    this.juz.setOnClickListener(new BackupMoveChooseUI.3(this));
    this.jux.setOnClickListener(new BackupMoveChooseUI.4(this));
    if (b.aSZ().aTd().jsY)
    {
      if ((b.aSZ().aTd().aSV() == null) || (b.aSZ().aTd().aSV().size() == 0));
      switch (juK)
      {
      default:
        this.juy.setVisibility(0);
        this.juA.setVisibility(4);
        AppMethodBeat.o(17333);
      case 0:
      case 1:
      }
    }
    while (true)
    {
      return;
      this.juy.setText(2131297200);
      break;
      this.juy.setText(2131297348);
      break;
      if (!b.aSZ().aTd().jsY)
      {
        this.jux.setTextColor(getResources().getColor(2131689746));
        this.jux.setClickable(false);
        this.juA.setVisibility(0);
        AppMethodBeat.o(17333);
      }
      else
      {
        this.juA.setVisibility(4);
        AppMethodBeat.o(17333);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(17337);
    if (paramInt2 != -1)
    {
      ab.e("MicroMsg.BackupMoveChooseUI", "onActivityResult result error! resultCode:%d", new Object[] { Integer.valueOf(paramInt2) });
      AppMethodBeat.o(17337);
    }
    while (true)
    {
      return;
      paramInt1 = juK;
      long l1 = startTime;
      long l2 = endTime;
      juK = paramIntent.getIntExtra("BACKUP_SELECT_TIME_MODE", juK);
      startTime = paramIntent.getLongExtra("BACKUP_SELECT_TIME_START_TIME", 0L);
      endTime = paramIntent.getLongExtra("BACKUP_SELECT_TIME_END_TIME", 0L);
      aPA = paramIntent.getIntExtra("BACKUP_SELECT_CONTENT_TYPE", aPA);
      ab.i("MicroMsg.BackupMoveChooseUI", "onActivityResult timeMode/preTimeMode[%d/%d], startTime/preStartTime[%d/%d], endTime/preEndTime[%d/%d], contentType[%d]", new Object[] { Integer.valueOf(juK), Integer.valueOf(paramInt1), Long.valueOf(startTime), Long.valueOf(l1), Long.valueOf(endTime), Long.valueOf(l2), Integer.valueOf(aPA) });
      b.aSZ().aTb();
      d.d(juK, startTime, endTime, aPA);
      fm(false);
      if ((paramInt1 != juK) || ((juK != 0) && ((juK != 1) || (startTime != l1) || (endTime != l2))))
        break;
      AppMethodBeat.o(17337);
    }
    b.aSZ().aTd().a(juK, startTime, endTime, b.aSZ().aTd().aSU());
    paramIntent = this.juv;
    paramIntent.jur.clear();
    paramIntent.juq.a(paramIntent.jur);
    if ((b.aSZ().aTd().aSV() == null) || (b.aSZ().aTd().aSV().size() == 0))
      switch (juK)
      {
      default:
        label348: this.juy.setVisibility(0);
      case 0:
      case 1:
      }
    while (true)
    {
      this.juv.notifyDataSetChanged();
      AppMethodBeat.o(17337);
      break;
      this.juy.setText(2131297200);
      break label348;
      this.juy.setText(2131297348);
      break label348;
      this.juy.setVisibility(4);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17330);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(17330);
  }

  public void onStart()
  {
    AppMethodBeat.i(17331);
    super.onStart();
    b.aSZ().aTd().jsT = this.juM;
    AppMethodBeat.o(17331);
  }

  public void onStop()
  {
    AppMethodBeat.i(17332);
    super.onStop();
    b.aSZ().aTd().jsT = null;
    AppMethodBeat.o(17332);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI
 * JD-Core Version:    0.6.2
 */