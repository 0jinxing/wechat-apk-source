package com.tencent.mm.ui.voicesearch;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bq;
import com.tencent.mm.model.br;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VoiceSearchResultUI extends MMActivity
{
  private int cKB = 2;
  private TextView kxK;
  private int lRx = -1;
  int showType = 1;
  private b zLE;
  private String[] zLF;
  private boolean zLG = false;
  boolean zLH = false;
  private ListView zLr;
  private String zLt = null;

  private static String[] U(String[] paramArrayOfString)
  {
    AppMethodBeat.i(35373);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      AppMethodBeat.o(35373);
    while (true)
    {
      return paramArrayOfString;
      ab.d("MicroMsg.VoiceSearchResultUI", "oldlist.length " + paramArrayOfString.length);
      HashMap localHashMap = new HashMap();
      ArrayList localArrayList = new ArrayList();
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str1 = paramArrayOfString[j];
        String str2 = s.mJ(str1);
        ab.d("MicroMsg.VoiceSearchResultUI", "displayname ".concat(String.valueOf(str2)));
        if ((!localHashMap.containsValue(str2)) || (!t.kH(str1)))
        {
          ab.d("MicroMsg.VoiceSearchResultUI", "username ".concat(String.valueOf(str1)));
          localHashMap.put(str2, str1);
          localArrayList.add(str1);
        }
      }
      paramArrayOfString = (String[])localArrayList.toArray(new String[localArrayList.size()]);
      AppMethodBeat.o(35373);
    }
  }

  private void V(String[] paramArrayOfString)
  {
    AppMethodBeat.i(35378);
    ArrayList localArrayList = new ArrayList();
    if ((paramArrayOfString != null) && (this.zLE != null))
    {
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str = paramArrayOfString[j];
        if (this.zLE.asz(str))
          localArrayList.add(str);
      }
    }
    if (localArrayList.size() == 0)
    {
      this.kxK.setVisibility(0);
      if (this.zLt != null)
        this.kxK.setText(this.zLt);
    }
    while (true)
    {
      if (this.zLE != null)
      {
        paramArrayOfString = this.zLE;
        paramArrayOfString.yDL = ((String[])localArrayList.toArray(new String[localArrayList.size()]));
        paramArrayOfString.sfv = null;
        paramArrayOfString.bIf();
        paramArrayOfString.ll(false);
      }
      AppMethodBeat.o(35378);
      return;
      this.kxK.setText(getString(2131296453));
      continue;
      this.kxK.setVisibility(8);
    }
  }

  static boolean asA(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(35377);
    Cursor[] arrayOfCursor = new Cursor[2];
    arrayOfCursor[0] = aw.ZK().fkd.b(t.fkP, null, paramString);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    try
    {
      while (arrayOfCursor[0].moveToNext())
      {
        String str = arrayOfCursor[0].getString(arrayOfCursor[0].getColumnIndex("username"));
        localArrayList1.add(str);
        if (!t.kH(str))
          localArrayList2.add(str);
        ab.d("MicroMsg.VoiceSearchResultUI", "block user ".concat(String.valueOf(str)));
      }
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace("MicroMsg.VoiceSearchResultUI", localException, "", new Object[0]);
      arrayOfCursor[1] = aw.ZK().fke.a(paramString, "@micromsg.with.all.biz.qq.com", localArrayList1, localArrayList2);
      int i = arrayOfCursor[1].getCount();
      int j = arrayOfCursor[0].getCount();
      arrayOfCursor[0].close();
      arrayOfCursor[1].close();
      ab.d("MicroMsg.VoiceSearchResultUI", "contactCount " + i + " conversationCount " + j);
      if (i + j > 1)
        break label239;
    }
    AppMethodBeat.o(35377);
    while (true)
    {
      return bool;
      label239: AppMethodBeat.o(35377);
      bool = false;
    }
  }

  private void dHz()
  {
    AppMethodBeat.i(35379);
    LinkedList localLinkedList = new LinkedList();
    switch (this.showType)
    {
    case 1:
    default:
    case 2:
    }
    while (true)
    {
      if (this.zLE != null)
        this.zLE.fl(localLinkedList);
      AppMethodBeat.o(35379);
      return;
      localLinkedList.add("lbsapp");
      localLinkedList.add("shakeapp");
      localLinkedList.add("qqfriend");
      localLinkedList.add("facebookapp");
      localLinkedList.add("feedsapp");
      localLinkedList.add("fmessage");
      localLinkedList.add("voipapp");
      localLinkedList.add("voicevoipapp");
      localLinkedList.add("voiceinputapp");
      localLinkedList.add("linkedinplugin");
      localLinkedList.add("notifymessage");
      int i = r.YK();
      if ((i & 0x1) != 0)
        localLinkedList.add("qqmail");
      if ((!t.Zl()) || ((i & 0x2) != 0))
        localLinkedList.add("tmessage");
      if ((i & 0x20) != 0)
        localLinkedList.add("qmessage");
      if ((i & 0x80) != 0)
        localLinkedList.add("qqsync");
      if ((i & 0x10) != 0)
        localLinkedList.add("medianote");
      if ((0x80000 & i) != 0)
        localLinkedList.add("newsapp");
      if (((0x40000 & i) != 0) || (!t.Zk()))
        localLinkedList.add("blogapp");
      if ((i & 0x10000) != 0)
        localLinkedList.add("masssendapp");
      localLinkedList.add("voiceinputapp");
    }
  }

  public final int getLayoutId()
  {
    return 2130971023;
  }

  public final void initView()
  {
    AppMethodBeat.i(35372);
    this.zLr = ((ListView)findViewById(2131828473));
    this.kxK = ((TextView)findViewById(2131821055));
    this.zLF = getIntent().getStringArrayExtra("VoiceSearchResultUI_Resultlist");
    this.zLt = getIntent().getStringExtra("VoiceSearchResultUI_Error");
    this.lRx = getIntent().getIntExtra("VoiceSearchResultUI_VoiceId", -1);
    this.showType = getIntent().getIntExtra("VoiceSearchResultUI_ShowType", 1);
    int i;
    if (this.showType == 1)
    {
      i = 2;
      this.cKB = i;
      this.zLH = getIntent().getBooleanExtra("VoiceSearchResultUI_IsVoiceControl", false);
      ab.i("MicroMsg.VoiceSearchResultUI", "showType = %s, isVoiceControl = %s", new Object[] { Integer.valueOf(this.showType), Boolean.valueOf(this.zLH) });
      this.zLE = new b(getApplicationContext(), this.showType);
      this.zLE.qV(false);
      dHz();
      this.zLr.setAdapter(this.zLE);
      this.kxK.setVisibility(8);
      ab.d("MicroMsg.VoiceSearchResultUI", "voiceId  " + this.lRx);
      if (this.showType != 2)
        break label313;
      setMMTitle("");
      this.zLF = U(this.zLF);
    }
    while (true)
    {
      setMMTitle(getString(2131304324));
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(35369);
          h localh;
          if (!VoiceSearchResultUI.a(VoiceSearchResultUI.this))
          {
            localh = h.pYm;
            paramAnonymousMenuItem = new StringBuilder().append(VoiceSearchResultUI.b(VoiceSearchResultUI.this)).append(",").append(VoiceSearchResultUI.c(VoiceSearchResultUI.this)).append(",");
            if (VoiceSearchResultUI.d(VoiceSearchResultUI.this) != null)
              break label122;
          }
          label122: for (int i = 0; ; i = VoiceSearchResultUI.d(VoiceSearchResultUI.this).length)
          {
            localh.X(10452, i + ",0");
            if (VoiceSearchResultUI.e(VoiceSearchResultUI.this))
              VoiceSearchResultUI.this.moveTaskToBack(true);
            VoiceSearchResultUI.this.finish();
            AppMethodBeat.o(35369);
            return true;
          }
        }
      });
      this.zLr.setOnItemClickListener(new VoiceSearchResultUI.2(this));
      V(this.zLF);
      AppMethodBeat.o(35372);
      return;
      i = 1;
      break;
      label313: setMMTitle(getString(2131304324));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(35371);
    super.onCreate(paramBundle);
    initView();
    this.zLG = false;
    AppMethodBeat.o(35371);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(35374);
    super.onDestroy();
    this.zLE.bIf();
    AppMethodBeat.o(35374);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(35376);
    int i;
    boolean bool;
    if (4 == paramInt)
      if (!this.zLG)
      {
        h localh = h.pYm;
        StringBuilder localStringBuilder = new StringBuilder().append(this.cKB).append(",").append(this.lRx).append(",");
        if (this.zLF == null)
        {
          i = 0;
          localh.X(10452, i + ",0");
        }
      }
      else
      {
        if (!this.zLH)
          break label129;
        moveTaskToBack(true);
        finish();
        AppMethodBeat.o(35376);
        bool = true;
      }
    while (true)
    {
      return bool;
      i = this.zLF.length;
      break;
      label129: bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(35376);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(35375);
    super.onPause();
    this.zLG = true;
    AppMethodBeat.o(35375);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.VoiceSearchResultUI
 * JD-Core Version:    0.6.2
 */