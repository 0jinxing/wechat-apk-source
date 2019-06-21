package com.tencent.mm.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureUploadManager.UploadTask;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.EmojiInfo.a;
import com.tencent.mm.ui.widget.a.e.c;

public class SmileyGrid extends GridView
{
  public static int zZY = 1;
  public int Aaa;
  private int Aab;
  private ChatFooterPanel.a Aac;
  private boolean Aad;
  public AdapterView.OnItemClickListener Aae;
  public ListAdapter Ei;
  private int gOW;
  private AdapterView.OnItemClickListener jMk;
  private int jiw;
  public int jiy;
  private j voG;
  private int zZZ;

  public SmileyGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(62913);
    this.zZZ = 20;
    this.Aaa = 0;
    this.Aab = 0;
    this.gOW = ChatFooterPanel.vhh;
    this.jMk = new SmileyGrid.1(this);
    this.Aae = new SmileyGrid.9(this);
    AppMethodBeat.o(62913);
  }

  public final void dMI()
  {
    AppMethodBeat.i(62916);
    setOnItemClickListener(this.jMk);
    AppMethodBeat.o(62916);
  }

  public int getSmileyType()
  {
    return this.zZZ;
  }

  public final void j(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(62917);
    ab.v("MicroMsg.emoji.SmileyGrid", "type:" + paramInt1 + " itemsPerPage:" + paramInt4 + " totalPage:" + paramInt5 + " curPage:" + this.jiy);
    setOnItemClickListener(this.jMk);
    this.zZZ = paramInt1;
    this.jiy = paramInt2;
    this.jiw = paramInt3;
    this.Aaa = paramInt4;
    this.Aab = paramInt5;
    AppMethodBeat.o(62917);
  }

  @TargetApi(8)
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(62915);
    super.onConfigurationChanged(paramConfiguration);
    AppMethodBeat.o(62915);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(62914);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(62914);
  }

  public void release()
  {
    this.Aac = null;
    this.voG = null;
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(62918);
    super.setAdapter(paramListAdapter);
    this.Ei = paramListAdapter;
    AppMethodBeat.o(62918);
  }

  public void setCallback(j paramj)
  {
    this.voG = paramj;
  }

  public void setOnTextOperationListener(ChatFooterPanel.a parama)
  {
    this.Aac = parama;
  }

  public void setScene(int paramInt)
  {
    this.gOW = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileyGrid
 * JD-Core Version:    0.6.2
 */