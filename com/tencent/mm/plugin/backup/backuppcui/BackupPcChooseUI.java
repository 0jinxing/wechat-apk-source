package com.tencent.mm.plugin.backup.backuppcui;

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
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.e;
import com.tencent.mm.plugin.backup.c.b.a;
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
public class BackupPcChooseUI extends MMWizardActivity
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
  private TextView jux;
  private TextView juy;
  private TextView juz;
  private a jwH;
  private ListView jwI;
  private b.a jwJ;

  public BackupPcChooseUI()
  {
    AppMethodBeat.i(17579);
    this.jwH = new a(this);
    this.juL = new SimpleDateFormat("yyyy.MM.dd");
    this.jwJ = new BackupPcChooseUI.5(this);
    AppMethodBeat.o(17579);
  }

  private void aTt()
  {
    AppMethodBeat.i(17586);
    if ((this.juD.getVisibility() == 8) && (this.juE.getVisibility() == 8) && (this.juF.getVisibility() == 8))
    {
      this.juB.setVisibility(8);
      this.juC.setVisibility(8);
      AppMethodBeat.o(17586);
    }
    while (true)
    {
      return;
      this.juB.setVisibility(0);
      this.juC.setVisibility(0);
      AppMethodBeat.o(17586);
    }
  }

  private void fm(boolean paramBoolean)
  {
    AppMethodBeat.i(17584);
    if (paramBoolean)
    {
      b.aTD();
      SharedPreferences localSharedPreferences = b.aSz();
      juK = localSharedPreferences.getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
      aPA = localSharedPreferences.getInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
      startTime = localSharedPreferences.getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
      endTime = localSharedPreferences.getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
    }
    if (b.aTD().aTF().jwv);
    switch (juK)
    {
    default:
      if (b.aTD().aTF().jww)
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
      AppMethodBeat.o(17584);
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
      this.juI.setText(this.mController.ylL.getResources().getString(2131297330));
    }
  }

  public final void a(HashSet<Integer> paramHashSet)
  {
    AppMethodBeat.i(17585);
    HashSet localHashSet = new HashSet();
    int i = b.aTD().aTH().aSV().size();
    Iterator localIterator = paramHashSet.iterator();
    while (localIterator.hasNext())
    {
      int j = ((Integer)localIterator.next()).intValue();
      if (j >= i)
        localHashSet.add(Integer.valueOf(j));
    }
    localIterator = localHashSet.iterator();
    while (localIterator.hasNext())
      paramHashSet.remove(Integer.valueOf(((Integer)localIterator.next()).intValue()));
    if (paramHashSet.size() != 0)
    {
      this.juJ.setEnabled(true);
      if ((b.aTD().aTH().jsY) && (paramHashSet.size() == this.jwH.getCount()))
      {
        this.jux.setText(2131297191);
        this.juB.setVisibility(0);
        this.juC.setVisibility(0);
        this.juD.setVisibility(0);
        this.juG.setText(getString(2131297193, new Object[] { Integer.valueOf(paramHashSet.size()) }));
      }
    }
    while (true)
    {
      aTt();
      AppMethodBeat.o(17585);
      return;
      this.jux.setText(2131297190);
      break;
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
    AppMethodBeat.i(17583);
    setMMTitle(2131297336);
    this.jwI = ((ListView)findViewById(2131821563));
    this.jwI.setAdapter(this.jwH);
    this.jwI.setEmptyView(findViewById(2131821564));
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
    ((TextView)findViewById(2131821570)).setText(2131297279);
    ((TextView)findViewById(2131821573)).setText(2131297282);
    ((TextView)findViewById(2131821576)).setText(2131297277);
    setBackBtn(new BackupPcChooseUI.1(this));
    this.juJ = ((Button)findViewById(2131821580));
    this.juJ.setOnClickListener(new BackupPcChooseUI.2(this));
    this.juJ.setEnabled(false);
    if ((!b.aTD().aTF().jwv) && (!b.aTD().aTF().jww))
      this.juz.setVisibility(8);
    while (true)
    {
      this.jux.setOnClickListener(new BackupPcChooseUI.4(this));
      if (b.aTD().aTH().jsY)
        break;
      this.jux.setTextColor(getResources().getColor(2131689746));
      this.jux.setClickable(false);
      this.juA.setVisibility(0);
      AppMethodBeat.o(17583);
      return;
      this.juz.setVisibility(0);
      fm(true);
      this.juz.setOnClickListener(new BackupPcChooseUI.3(this));
    }
    if (b.aTD().aTH().aSV().size() == 0)
      switch (juK)
      {
      default:
      case 0:
      case 1:
      }
    while (true)
    {
      this.juy.setVisibility(0);
      this.juA.setVisibility(4);
      AppMethodBeat.o(17583);
      break;
      this.juy.setText(2131297278);
      continue;
      this.juy.setText(2131297348);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(17587);
    if (paramInt2 != -1)
    {
      ab.e("MicroMsg.BackupPcChooseUI", "onActivityResult result error! resultCode[%d]", new Object[] { Integer.valueOf(paramInt2) });
      AppMethodBeat.o(17587);
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
      ab.i("MicroMsg.BackupPcChooseUI", "onActivityResult timeMode/preTimeMode[%d/%d], startTime/preStartTime[%d/%d], endTime/preEndTime[%d/%d], contentType[%d]", new Object[] { Integer.valueOf(juK), Integer.valueOf(paramInt1), Long.valueOf(startTime), Long.valueOf(l1), Long.valueOf(endTime), Long.valueOf(l2), Integer.valueOf(aPA) });
      b.aTD().aTF();
      e.e(juK, startTime, endTime, aPA);
      fm(false);
      if ((paramInt1 != juK) || ((juK != 0) && ((juK != 1) || (startTime != l1) || (endTime != l2))))
        break;
      AppMethodBeat.o(17587);
    }
    b.aTD().aTH().a(juK, startTime, endTime, b.aTD().aTH().aSU());
    paramIntent = this.jwH;
    paramIntent.jur.clear();
    paramIntent.jwE.a(paramIntent.jur);
    if ((b.aTD().aTH().aSV() == null) || (b.aTD().aTH().aSV().size() == 0))
      switch (juK)
      {
      default:
        label352: this.juy.setVisibility(0);
      case 0:
      case 1:
      }
    while (true)
    {
      this.jwH.notifyDataSetChanged();
      AppMethodBeat.o(17587);
      break;
      this.juy.setText(2131297278);
      break label352;
      this.juy.setText(2131297348);
      break label352;
      this.juy.setVisibility(4);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17580);
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
      AppMethodBeat.o(17580);
    while (true)
    {
      return;
      initView();
      AppMethodBeat.o(17580);
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(17581);
    super.onStart();
    b.aTD().aTH().jvS = this.jwJ;
    AppMethodBeat.o(17581);
  }

  public void onStop()
  {
    AppMethodBeat.i(17582);
    super.onStop();
    b.aTD().aTH().jvS = null;
    AppMethodBeat.o(17582);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcChooseUI
 * JD-Core Version:    0.6.2
 */