package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.j;
import com.tencent.mm.plugin.game.model.j.a;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

abstract class m extends a<c>
{
  protected Context mContext;
  protected int mXC = 0;
  private m.a nfm;
  protected int ngM = 14;
  private j.a ngQ = new m.3(this);
  protected d ngR;
  private DialogInterface.OnClickListener nhB = new m.5(this);
  protected View.OnClickListener nhC = new m.4(this);
  protected int nkj;
  protected boolean nkk = true;
  protected boolean nkl = false;
  protected boolean nkm = false;
  protected int nkn;
  protected ConcurrentHashMap<String, k> nko;
  protected SparseArray<View> nkp;

  public m(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.nko = new ConcurrentHashMap();
    j.a(this.ngQ);
    this.nkp = new SparseArray();
    this.ngR = new d(paramContext);
    this.ngR.neA = this.nhB;
  }

  public void Oj(String paramString)
  {
    if (bo.isNullOrNil(paramString));
    while (true)
    {
      return;
      if (this.nko.containsKey(paramString))
      {
        paramString = (k)this.nko.get(paramString);
        if (paramString != null)
          paramString.bEj();
      }
    }
  }

  public void Ok(String paramString)
  {
    if (bo.isNullOrNil(paramString));
    while (true)
    {
      return;
      if (this.nko.containsKey(paramString))
      {
        paramString = (k)this.nko.get(paramString);
        if (paramString != null)
          paramString.biT();
      }
    }
  }

  public void Ol(String paramString)
  {
    int i = 0;
    if (i < this.mYj.size())
      if (((c)this.mYj.get(i)).field_appId.equals(paramString))
      {
        paramString = (c)this.mYj.get(i);
        label46: if (paramString != null)
          break label62;
      }
    while (true)
    {
      return;
      i++;
      break;
      paramString = null;
      break label46;
      label62: if (!this.nko.containsKey(paramString.field_appId))
      {
        ab.e("MicroMsg.GameListAdapter", "No DownloadInfo found");
      }
      else
      {
        k localk = (k)this.nko.get(paramString.field_appId);
        this.ngR.a(paramString, localk);
      }
    }
  }

  public void U(View paramView, int paramInt)
  {
    paramView = (m.b)paramView.getTag();
    c localc = (c)this.mYj.get(paramInt);
    if (paramView != null)
      this.ngR.a(paramView.nkA, paramView.nkz, localc, (k)this.nko.get(localc.field_appId));
    while (true)
    {
      return;
      ab.e("MicroMsg.GameListAdapter", "holder should not be null, %d", new Object[] { Integer.valueOf(paramInt) });
    }
  }

  public void Y(LinkedList<c> paramLinkedList)
  {
    if (paramLinkedList == null);
    while (true)
    {
      return;
      g.RS().aa(new m.1(this, paramLinkedList));
    }
  }

  public void Z(LinkedList<c> paramLinkedList)
  {
    if (paramLinkedList == null);
    while (true)
    {
      return;
      com.tencent.mm.sdk.g.d.post(new m.2(this, paramLinkedList), "game_get_download_info");
    }
  }

  abstract void a(c paramc, m.b paramb);

  abstract void a(c paramc, m.b paramb, int paramInt);

  public void a(m.a parama)
  {
    this.nfm = parama;
  }

  public void clear()
  {
    super.clear();
    j.b(this.ngQ);
  }

  public void e(SparseArray<View> paramSparseArray)
  {
    if (paramSparseArray != null);
    for (this.nkp = paramSparseArray; ; this.nkp = new SparseArray())
    {
      notifyDataSetChanged();
      return;
    }
  }

  public int getItemViewType(int paramInt)
  {
    return ((c)getItem(paramInt)).type;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    c localc = (c)getItem(paramInt);
    int i;
    if (paramView == null)
    {
      paramView = this.mContext;
      switch (localc.type)
      {
      default:
        i = 0;
        paramView = View.inflate(paramView, i, null);
        paramViewGroup = new m.b();
        paramViewGroup.nfd = ((ViewGroup)paramView.findViewById(2131824316));
        paramViewGroup.nku = ((TextView)paramView.findViewById(2131824295));
        paramViewGroup.nkv = ((ImageView)paramView.findViewById(2131821535));
        paramViewGroup.njw = ((TextView)paramView.findViewById(2131821537));
        paramViewGroup.nkw = ((TextView)paramView.findViewById(2131824400));
        paramViewGroup.nkx = ((TextView)paramView.findViewById(2131824409));
        paramViewGroup.nky = ((TextView)paramView.findViewById(2131824318));
        paramViewGroup.nkz = ((Button)paramView.findViewById(2131824401));
        paramViewGroup.nkA = ((TextProgressBar)paramView.findViewById(2131824402));
        paramViewGroup.nkD = ((LinearLayout)paramView.findViewById(2131824290));
        paramViewGroup.nkB = ((GameListSocialView)paramView.findViewById(2131824403));
        paramViewGroup.nkC = ((ViewGroup)paramView.findViewById(2131824554));
        paramView.setTag(paramViewGroup);
        label240: switch (localc.type)
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
      return paramView;
      i = this.nkj;
      break;
      i = 2130969649;
      break;
      paramViewGroup = (m.b)paramView.getTag();
      break label240;
      a(localc, paramViewGroup, paramInt);
      if ((this.nkn == 2) && (!localc.mVC))
      {
        com.tencent.mm.plugin.game.e.a.a(this.mContext, 10, 1004, localc.position, localc.field_appId, this.mXC, localc.mVB);
        localc.mVC = true;
        continue;
        a(localc, paramViewGroup);
      }
    }
  }

  public int getViewTypeCount()
  {
    return 2;
  }

  public void refresh()
  {
    notifyDataSetChanged();
  }

  public void setSourceScene(int paramInt)
  {
    this.mXC = paramInt;
  }

  public void wG(int paramInt)
  {
    this.nkn = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.m
 * JD-Core Version:    0.6.2
 */