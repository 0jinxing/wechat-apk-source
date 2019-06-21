package com.tencent.mm.plugin.backup.backupui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.RadioCheckPreference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.widget.e;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@a(3)
public class BackupSelectExtUI extends MMPreference
{
  private int aPA;
  private f ehK;
  private long endTime;
  private int jqS;
  private long jsU;
  private int juK;
  private SimpleDateFormat juL;
  private RadioCheckPreference jyK;
  private RadioCheckPreference jyL;
  private RadioCheckPreference jyM;
  private RadioCheckPreference jyN;
  private Preference jyO;
  private Preference jyP;
  private boolean jyQ;
  private long startTime;

  public BackupSelectExtUI()
  {
    AppMethodBeat.i(17729);
    this.juK = 0;
    this.jyQ = false;
    this.aPA = 0;
    this.startTime = 0L;
    this.endTime = 0L;
    this.jsU = 0L;
    this.juL = new SimpleDateFormat("yyyy.MM.dd");
    AppMethodBeat.o(17729);
  }

  private void aUv()
  {
    AppMethodBeat.i(17734);
    switch (this.juK)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(17734);
      while (true)
      {
        return;
        this.jyK.qg(true);
        this.jyL.qg(false);
        this.ehK.d(this.jyP);
        this.ehK.d(this.jyO);
        enableOptionMenu(true);
        this.ehK.notifyDataSetChanged();
        AppMethodBeat.o(17734);
      }
      cu();
    }
  }

  private void aUw()
  {
    AppMethodBeat.i(17735);
    switch (this.aPA)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(17735);
      while (true)
      {
        return;
        this.jyM.qg(true);
        this.jyN.qg(false);
        this.ehK.notifyDataSetChanged();
        AppMethodBeat.o(17735);
      }
      this.jyM.qg(false);
      this.jyN.qg(true);
      this.ehK.notifyDataSetChanged();
    }
  }

  private void aUx()
  {
    AppMethodBeat.i(17737);
    if ((this.startTime == 0L) || (this.endTime == 0L))
    {
      this.jyP.setSummary(2131297355);
      this.jyO.setSummary(2131297355);
    }
    for (boolean bool = false; ; bool = true)
    {
      enableOptionMenu(bool);
      AppMethodBeat.o(17737);
      return;
      this.jyP.setSummary(this.juL.format(new Date(this.startTime)));
      this.jyO.setSummary(this.juL.format(new Date(this.endTime - 86400000L)));
      if ((this.startTime == 0L) || (this.endTime == 0L))
        break;
    }
  }

  private void cu()
  {
    AppMethodBeat.i(17736);
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165196);
    this.jyK = ((RadioCheckPreference)this.ehK.aqO("backup_select_ext_time_all"));
    this.jyL = ((RadioCheckPreference)this.ehK.aqO("backup_select_ext_time_some"));
    this.jyP = this.ehK.aqO("backup_select_begin_time");
    this.jyO = this.ehK.aqO("backup_select_end_time");
    this.jyM = ((RadioCheckPreference)this.ehK.aqO("backup_select_ext_content_all_msg"));
    this.jyN = ((RadioCheckPreference)this.ehK.aqO("backup_select_ext_content_text_only"));
    if (!this.jyQ)
    {
      this.ehK.d(this.ehK.aqO("backup_select_ext_content_title"));
      this.ehK.d(this.jyM);
      this.ehK.d(this.jyN);
    }
    if (this.jqS == 1)
    {
      this.ehK.aqO("backup_select_ext_time_title").setTitle(2131297334);
      if (this.jyQ)
        this.ehK.aqO("backup_select_ext_content_title").setTitle(2131297332);
      switch (this.juK)
      {
      default:
        label256: if (this.jyQ)
          switch (this.aPA)
          {
          default:
          case 0:
          case 1:
          }
        break;
      case 0:
      case 1:
      }
    }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(17736);
      return;
      if (this.jqS != 2)
        break;
      this.ehK.aqO("backup_select_ext_time_title").setTitle(2131297264);
      if (!this.jyQ)
        break;
      this.ehK.aqO("backup_select_ext_content_title").setTitle(2131297262);
      break;
      this.jyK.qg(true);
      this.jyL.qg(false);
      this.jyP.setEnabled(false);
      this.jyO.setEnabled(false);
      this.ehK.d(this.jyP);
      this.ehK.d(this.jyO);
      enableOptionMenu(true);
      break label256;
      aUx();
      this.jyK.qg(false);
      this.jyL.qg(true);
      this.jyP.setEnabled(true);
      this.jyO.setEnabled(true);
      break label256;
      this.jyM.qg(true);
      this.jyN.qg(false);
      continue;
      this.jyM.qg(false);
      this.jyN.qg(true);
    }
  }

  public final int JC()
  {
    return 2131165196;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(17731);
    paramf = paramPreference.mKey;
    if (paramf.equals("backup_select_ext_time_all"))
    {
      this.juK = 0;
      aUv();
      AppMethodBeat.o(17731);
    }
    while (true)
    {
      return bool;
      if (paramf.equals("backup_select_ext_time_some"))
      {
        this.juK = 1;
        aUv();
        AppMethodBeat.o(17731);
      }
      else
      {
        if (paramf.equals("backup_select_ext_content_all_msg"))
        {
          if (this.jyQ)
          {
            this.aPA = 0;
            aUw();
          }
          while (true)
          {
            AppMethodBeat.o(17731);
            break;
            ab.e("MicroMsg.BackupSelectExtUI", "onPreferenceTreeClick select ext content all msg, but not support content type");
          }
        }
        if (paramf.equals("backup_select_ext_content_text_only"))
        {
          if (this.jyQ)
          {
            this.aPA = 1;
            aUw();
          }
          while (true)
          {
            AppMethodBeat.o(17731);
            break;
            ab.e("MicroMsg.BackupSelectExtUI", "onPreferenceTreeClick select ext content text only, but not support content type");
          }
        }
        if (paramf.equals("backup_select_begin_time"))
        {
          showDialog(1);
          AppMethodBeat.o(17731);
        }
        else if (paramf.equals("backup_select_end_time"))
        {
          showDialog(2);
          AppMethodBeat.o(17731);
        }
        else
        {
          AppMethodBeat.o(17731);
          bool = false;
        }
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(17733);
    this.jqS = getIntent().getIntExtra("BACKUP_MODE", 0);
    setMMTitle(2131297351);
    this.juK = getIntent().getIntExtra("BACKUP_SELECT_TIME_MODE", 0);
    this.jyQ = getIntent().getBooleanExtra("BACKUP_SELECT_SUPPORT_CONTENT_TYPE", false);
    this.aPA = getIntent().getIntExtra("BACKUP_SELECT_CONTENT_TYPE", 0);
    this.startTime = getIntent().getLongExtra("BACKUP_SELECT_TIME_START_TIME", 0L);
    this.endTime = getIntent().getLongExtra("BACKUP_SELECT_TIME_END_TIME", 0L);
    this.jsU = getIntent().getLongExtra("BACKUP_SELECT_TIME_MIN_CONVERSATION_TIME", 0L);
    cu();
    setBackBtn(new BackupSelectExtUI.2(this));
    a(0, getString(2131297376), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(17728);
        if ((BackupSelectExtUI.g(BackupSelectExtUI.this) == 1) && (BackupSelectExtUI.d(BackupSelectExtUI.this) >= BackupSelectExtUI.e(BackupSelectExtUI.this)))
          if (BackupSelectExtUI.h(BackupSelectExtUI.this) == 1)
          {
            h.b(BackupSelectExtUI.this.mController.ylL, BackupSelectExtUI.this.getString(2131297283), "", true);
            AppMethodBeat.o(17728);
          }
        while (true)
        {
          return true;
          if (BackupSelectExtUI.h(BackupSelectExtUI.this) != 2)
            break;
          h.b(BackupSelectExtUI.this.mController.ylL, BackupSelectExtUI.this.getString(2131297204), "", true);
          break;
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("BACKUP_SELECT_TIME_MODE", BackupSelectExtUI.g(BackupSelectExtUI.this));
          paramAnonymousMenuItem.putExtra("BACKUP_SELECT_CONTENT_TYPE", BackupSelectExtUI.i(BackupSelectExtUI.this));
          paramAnonymousMenuItem.putExtra("BACKUP_SELECT_TIME_START_TIME", BackupSelectExtUI.d(BackupSelectExtUI.this));
          paramAnonymousMenuItem.putExtra("BACKUP_SELECT_TIME_END_TIME", BackupSelectExtUI.e(BackupSelectExtUI.this));
          BackupSelectExtUI.this.setResult(-1, paramAnonymousMenuItem);
          BackupSelectExtUI.this.finish();
          AppMethodBeat.o(17728);
        }
      }
    }
    , q.b.ymu);
    AppMethodBeat.o(17733);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17730);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    initView();
    AppMethodBeat.o(17730);
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    AppMethodBeat.i(17732);
    Calendar localCalendar = Calendar.getInstance();
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      int i = localCalendar.get(1);
      int j = localCalendar.get(2);
      e locale = new e(this.mController.ylL, new BackupSelectExtUI.1(this, paramInt), i, j, localCalendar.get(5), localCalendar.getTimeInMillis(), (byte)0);
      locale.setCanceledOnTouchOutside(false);
      long l1 = bo.anU() / 86400000L * 86400000L + 57600000L - 1L;
      long l2 = this.jsU / 86400000L * 86400000L + 57600000L - 86400000L;
      if (l1 > l2);
      try
      {
        locale.nx(l2);
        locale.nw(l1);
        AppMethodBeat.o(17732);
        return locale;
        if (this.startTime == 0L);
        for (l2 = bo.anU(); ; l2 = this.startTime)
        {
          localCalendar.setTimeInMillis(l2);
          break;
        }
        if (this.endTime == 0L);
        for (l2 = bo.anU(); ; l2 = this.endTime - 86400000L)
        {
          localCalendar.setTimeInMillis(l2);
          break;
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.BackupSelectExtUI", "DatePicker exception!! minTime:%d, maxTime:%d, exception:%s", new Object[] { Long.valueOf(l2), Long.valueOf(l1), localException });
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
 * Qualified Name:     com.tencent.mm.plugin.backup.backupui.BackupSelectExtUI
 * JD-Core Version:    0.6.2
 */