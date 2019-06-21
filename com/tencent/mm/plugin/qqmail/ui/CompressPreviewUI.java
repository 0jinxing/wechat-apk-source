package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.plugin.qqmail.b.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CompressPreviewUI extends MMActivity
{
  private ProgressBar juA;
  private TextView mKx;
  private String ptI;
  private String pux;
  private String pvZ;
  private c pwy;
  private long pxn;
  private List<CompressPreviewUI.a> pxo;
  private String pxp;
  private ListView pxq;
  private CompressPreviewUI.b pxr;
  private v.a pxs;

  public CompressPreviewUI()
  {
    AppMethodBeat.i(68251);
    this.ptI = null;
    this.pux = null;
    this.pxn = 0L;
    this.pwy = new c(this);
    this.pxo = new ArrayList();
    this.pxs = new CompressPreviewUI.5(this);
    AppMethodBeat.o(68251);
  }

  private void Vp(String paramString)
  {
    AppMethodBeat.i(68256);
    ab.i("MicroMsg.CompressPreviewUI", "curPath=".concat(String.valueOf(paramString)));
    this.juA.setVisibility(8);
    this.mKx.setVisibility(8);
    this.pxq.setVisibility(0);
    CompressPreviewUI.a locala1 = Vq(paramString);
    ArrayList localArrayList = new ArrayList();
    if (locala1 != null)
      localArrayList.add(locala1);
    for (int i = 0; i < this.pxo.size(); i++)
    {
      CompressPreviewUI.a locala2 = (CompressPreviewUI.a)this.pxo.get(i);
      if (((paramString.endsWith(locala2.pxv)) && (locala2.pxv.length() > 0)) || (locala2.pxv.equals(paramString)))
        localArrayList.add(locala2);
    }
    this.pxr.a(locala1, localArrayList);
    this.pxr.notifyDataSetChanged();
    this.pxq.setSelection(0);
    AppMethodBeat.o(68256);
  }

  private CompressPreviewUI.a Vq(String paramString)
  {
    AppMethodBeat.i(68257);
    Iterator localIterator = this.pxo.iterator();
    while (localIterator.hasNext())
    {
      CompressPreviewUI.a locala = (CompressPreviewUI.a)localIterator.next();
      if (locala.id.equals(paramString))
      {
        AppMethodBeat.o(68257);
        paramString = locala;
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(68257);
    }
  }

  private void ccW()
  {
    AppMethodBeat.i(68258);
    HashMap localHashMap = new HashMap();
    localHashMap.put("mailid", this.ptI);
    localHashMap.put("attachid", this.pux);
    localHashMap.put("fun", "list");
    ac.ccC().a("/cgi-bin/viewcompress", localHashMap, this.pxs);
    AppMethodBeat.o(68258);
  }

  public final int getLayoutId()
  {
    return 2130970014;
  }

  public final void initView()
  {
    AppMethodBeat.i(68253);
    this.pxq = ((ListView)findViewById(2131825698));
    this.mKx = ((TextView)findViewById(2131825699));
    this.juA = ((ProgressBar)findViewById(2131825700));
    if ((this.ptI == null) || (this.pux == null))
    {
      this.juA.setVisibility(8);
      this.mKx.setText(2131301265);
      AppMethodBeat.o(68253);
    }
    while (true)
    {
      return;
      this.pxr = new CompressPreviewUI.b(this, (byte)0);
      this.pxq.setAdapter(this.pxr);
      this.pxq.setOnItemClickListener(new CompressPreviewUI.1(this));
      setBackBtn(new CompressPreviewUI.2(this));
      new CompressPreviewUI.3(this);
      addTextOptionMenu(0, getString(2131296887), new CompressPreviewUI.4(this));
      ccW();
      AppMethodBeat.o(68253);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(68252);
    super.onCreate(paramBundle);
    this.ptI = getIntent().getStringExtra("mail_id");
    this.pux = getIntent().getStringExtra("attach_id");
    this.pxn = getIntent().getLongExtra("attach_size", 0L);
    this.pvZ = getIntent().getStringExtra("attach_name");
    initView();
    setMMTitle(this.pvZ);
    AppMethodBeat.o(68252);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(68254);
    super.onDestroy();
    this.pwy.release();
    AppMethodBeat.o(68254);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(68255);
    if ((paramInt == 4) && (this.pxr.ccY() != null))
    {
      Vp(this.pxr.ccY());
      AppMethodBeat.o(68255);
    }
    while (true)
    {
      return bool;
      if (paramKeyEvent == null)
      {
        finish();
        AppMethodBeat.o(68255);
      }
      else
      {
        bool = super.onKeyDown(paramInt, paramKeyEvent);
        AppMethodBeat.o(68255);
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
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI
 * JD-Core Version:    0.6.2
 */