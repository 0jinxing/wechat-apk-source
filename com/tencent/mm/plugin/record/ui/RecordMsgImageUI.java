package com.tencent.mm.plugin.record.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.record.a.d;
import com.tencent.mm.plugin.record.a.e;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.b.l;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class RecordMsgImageUI extends MMActivity
  implements d
{
  private long cvx;
  private List<aar> elG;
  private j icA;
  private MMGestureGallery kkn;
  private n.d lcJ;
  private Runnable mhD;
  private Map<String, nr> mim;
  private com.tencent.mm.sdk.b.c mip;
  private l pKH;
  private RecordMsgImageUI.a pKO;
  private String pKP;
  private int selection;

  public RecordMsgImageUI()
  {
    AppMethodBeat.i(24312);
    this.elG = new LinkedList();
    this.selection = 0;
    this.cvx = -1L;
    this.pKP = null;
    this.mim = new HashMap();
    this.lcJ = new RecordMsgImageUI.9(this);
    this.mhD = new RecordMsgImageUI.2(this);
    this.mip = new RecordMsgImageUI.3(this);
    AppMethodBeat.o(24312);
  }

  public final void a(int paramInt, i parami)
  {
    AppMethodBeat.i(24318);
    Iterator localIterator = this.elG.iterator();
    while (localIterator.hasNext())
      if (((aar)localIterator.next()).mnd.equals(parami.field_dataId))
      {
        al.d(this.mhD);
        AppMethodBeat.o(24318);
      }
    while (true)
    {
      return;
      AppMethodBeat.o(24318);
    }
  }

  final String ceS()
  {
    AppMethodBeat.i(24315);
    int i = this.kkn.getSelectedItemPosition();
    String str;
    if (-1 == i)
    {
      ab.w("MicroMsg.ShowImageUI", "error position");
      str = null;
      AppMethodBeat.o(24315);
    }
    while (true)
    {
      return str;
      str = n.c(this.pKO.BI(i), this.cvx);
      ab.d("MicroMsg.ShowImageUI", "cur pos %d path %s", new Object[] { Integer.valueOf(i), str });
      AppMethodBeat.o(24315);
    }
  }

  public final void dealContentView(View paramView)
  {
    AppMethodBeat.i(24316);
    ae.h(ae.a(getWindow(), null), this.mController.ylv);
    ((ViewGroup)this.mController.ylv.getParent()).removeView(this.mController.ylv);
    ((ViewGroup)getWindow().getDecorView()).addView(this.mController.ylv, 0);
    AppMethodBeat.o(24316);
  }

  public final int getLayoutId()
  {
    return 2130970677;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(24317);
    Object localObject;
    if ((1001 == paramInt1) && (-1 == paramInt2))
      if (paramIntent == null)
      {
        localObject = null;
        if (paramIntent != null)
          break label58;
        paramIntent = null;
        label31: if (!bo.isNullOrNil((String)localObject))
          break label69;
        AppMethodBeat.o(24317);
      }
    while (true)
    {
      return;
      localObject = paramIntent.getStringExtra("Select_Conv_User");
      break;
      label58: paramIntent = paramIntent.getStringExtra("custom_send_text");
      break label31;
      label69: ArrayList localArrayList = bo.P(((String)localObject).split(","));
      if (bo.ek(localArrayList))
      {
        ab.w("MicroMsg.ShowImageUI", "want to send record msg, but toUser is null");
        AppMethodBeat.o(24317);
      }
      else
      {
        localObject = new RecordMsgImageUI.10(this, h.b(this.mController.ylL, getString(2131299643), false, null));
        aw.RS().aa(new RecordMsgImageUI.11(this, localArrayList, paramIntent, (Runnable)localObject));
        AppMethodBeat.o(24317);
        continue;
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
        AppMethodBeat.o(24317);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24313);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setFlags(1024, 1024);
    this.pKH = new l();
    this.cvx = getIntent().getLongExtra("message_id", -1L);
    paramBundle = getIntent().getStringExtra("record_data_id");
    Object localObject = n.VI(getIntent().getStringExtra("record_xml"));
    if (localObject == null)
    {
      ab.w("MicroMsg.ShowImageUI", "get record msg data error, empty");
      finish();
      AppMethodBeat.o(24313);
    }
    while (true)
    {
      return;
      Iterator localIterator = ((com.tencent.mm.protocal.b.a.c)localObject).fjr.iterator();
      while (localIterator.hasNext())
      {
        localObject = (aar)localIterator.next();
        if (((aar)localObject).dataType == 2)
        {
          this.elG.add(localObject);
          if (((aar)localObject).mnd.equals(paramBundle))
            this.selection = (this.elG.size() - 1);
        }
      }
      if (this.elG.isEmpty())
      {
        ab.w("MicroMsg.ShowImageUI", "get image data error, empty");
        finish();
        AppMethodBeat.o(24313);
      }
      else
      {
        this.kkn = ((MMGestureGallery)findViewById(2131822081));
        this.kkn.setVerticalFadingEdgeEnabled(false);
        this.kkn.setHorizontalFadingEdgeEnabled(false);
        this.pKO = new RecordMsgImageUI.a((byte)0);
        this.pKO.elG = this.elG;
        this.pKO.cvx = this.cvx;
        this.pKO.pKH = this.pKH;
        this.kkn.setAdapter(this.pKO);
        this.kkn.setSelection(this.selection);
        this.kkn.setOnItemSelectedListener(new RecordMsgImageUI.1(this));
        this.kkn.setSingleClickOverListener(new RecordMsgImageUI.4(this));
        this.kkn.setLongClickOverListener(new RecordMsgImageUI.5(this));
        fullScreenNoTitleBar(true);
        setBackBtn(new RecordMsgImageUI.6(this));
        ((com.tencent.mm.plugin.record.a.a)g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().a(this);
        com.tencent.mm.sdk.b.a.xxA.c(this.mip);
        AppMethodBeat.o(24313);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24314);
    ((com.tencent.mm.plugin.record.a.a)g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(this);
    this.pKH.destory();
    com.tencent.mm.sdk.b.a.xxA.d(this.mip);
    super.onDestroy();
    AppMethodBeat.o(24314);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgImageUI
 * JD-Core Version:    0.6.2
 */