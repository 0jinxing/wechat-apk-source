package com.tencent.mm.plugin.emoji.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.i.a;
import com.tencent.mm.protocal.protobuf.EmotionBannerSet;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public abstract class a extends BaseAdapter
{
  private final String TAG = "MicroMsg.BaseEmojiListAdapter";
  private final String euI = "lock";
  public AbsListView kSO;
  public c kSP;
  public i.a kSQ;
  protected volatile boolean kSR = false;
  private int kSS = 0;
  private int kST = 0;
  private HashMap<String, com.tencent.mm.plugin.emoji.a.a> kSz;
  protected Context mContext;

  public a(Context paramContext)
  {
    this.mContext = paramContext;
    if (this.mContext != null)
      this.kSz = new HashMap();
  }

  public static String a(f paramf)
  {
    if (paramf == null)
      paramf = null;
    while (true)
    {
      return paramf;
      if (paramf.kTa == f.a.kTj)
        paramf = paramf.kTc.ID + "_cell";
      else
        paramf = paramf.kTb.ProductID;
    }
  }

  public final com.tencent.mm.plugin.emoji.a.a IS(String paramString)
  {
    if (this.kSz == null);
    for (paramString = null; ; paramString = (com.tencent.mm.plugin.emoji.a.a)this.kSz.get(paramString))
      return paramString;
  }

  protected c a(com.tencent.mm.plugin.emoji.model.f paramf)
  {
    return new c(paramf);
  }

  public final void a(c paramc)
  {
    if ((paramc == null) || (this.kSP == paramc));
    while (true)
    {
      return;
      this.kSP = paramc.bjC();
      notifyDataSetChanged();
    }
  }

  protected final void a(f paramf, String paramString, int paramInt)
  {
    if ((paramf == null) || (paramString == null));
    while (true)
    {
      return;
      paramf.setStatus(paramInt);
      this.kSP.bY(paramString, paramInt);
    }
  }

  public abstract View b(int paramInt, View paramView, ViewGroup paramViewGroup);

  public final void b(final com.tencent.mm.plugin.emoji.model.f paramf)
  {
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(52773);
        if (paramf == null)
          AppMethodBeat.o(52773);
        while (true)
        {
          return;
          a.a(a.this, a.this.a(paramf));
          a.this.notifyDataSetChanged();
          AppMethodBeat.o(52773);
        }
      }
    });
  }

  public void bW(String paramString, int paramInt)
  {
    if ((this.kSz == null) || (this.kSP == null) || (paramString == null));
    label141: 
    while (true)
    {
      return;
      Object localObject = this.kSP.IT(paramString);
      if (localObject != null)
        a((f)localObject, paramString, paramInt);
      if ((localObject != null) && (this.kSP != null) && (((f)localObject).mStatus == -1))
      {
        ab.i("MicroMsg.BaseEmojiListAdapter", "force refresh status");
        ((f)localObject).a(this.kSP.kSY, this.kSP.IX(paramString), this.kSP.IV(paramString));
      }
      com.tencent.mm.plugin.emoji.a.a locala = IS(paramString);
      if (locala != null)
      {
        if (locala.getProductId() == null);
        for (localObject = null; ; localObject = locala.getProductId())
        {
          if ((localObject == null) || (!((String)localObject).equals(paramString)))
            break label141;
          locala.bjs();
          break;
        }
      }
    }
  }

  public final void bX(String paramString, int paramInt)
  {
    if ((this.kSz == null) || (this.kSP == null) || (paramString == null));
    label118: 
    while (true)
    {
      return;
      Object localObject = this.kSP.IT(paramString);
      if (localObject != null)
      {
        if ((paramInt >= 0) && (paramInt < 100))
        {
          a((f)localObject, paramString, 6);
          ((f)localObject).EV = paramInt;
        }
        if (paramInt >= 100)
          a((f)localObject, paramString, 7);
      }
      com.tencent.mm.plugin.emoji.a.a locala = IS(paramString);
      if (locala != null)
      {
        if (locala.getProductId() == null);
        for (localObject = null; ; localObject = locala.getProductId())
        {
          if ((localObject == null) || (!((String)localObject).equals(paramString)))
            break label118;
          locala.bjs();
          break;
        }
      }
    }
  }

  protected void bjv()
  {
    if (this.kSz != null)
      this.kSz.clear();
    super.notifyDataSetChanged();
    this.kSR = true;
  }

  public abstract int bjw();

  public abstract int bjx();

  public abstract int bjy();

  public void clear()
  {
    if (this.kSz != null)
    {
      this.kSz.clear();
      this.kSz = null;
    }
    if (this.kSP != null)
    {
      this.kSP.clear();
      this.kSP = null;
    }
    this.kSR = false;
  }

  protected abstract com.tencent.mm.plugin.emoji.a.a d(Context paramContext, View paramView);

  public int getCount()
  {
    if (this.kSP == null);
    for (int i = 0; ; i = this.kSP.size())
      return i;
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.tencent.mm.plugin.emoji.a.a locala1 = null;
    if (paramView != null)
      locala1 = (com.tencent.mm.plugin.emoji.a.a)paramView.getTag();
    f localf = tX(paramInt);
    com.tencent.mm.plugin.emoji.a.a locala2;
    View localView;
    if (locala1 == null)
    {
      locala2 = d(this.mContext, paramView);
      localView = locala2.bjt();
      this.kSz.put(a(localf), locala2);
    }
    while (true)
    {
      locala2.mPosition = paramInt;
      locala2.kRB = localf;
      paramView = b(paramInt, localView, paramViewGroup);
      locala2.bjs();
      return paramView;
      locala2 = locala1;
      localView = paramView;
      if (!bo.isNullOrNil(a(localf)))
      {
        if (this.kSz.containsValue(locala1))
          this.kSz.remove(locala1.getProductId());
        this.kSz.put(a(localf), locala1);
        locala2 = locala1;
        localView = paramView;
      }
    }
  }

  public void notifyDataSetChanged()
  {
    this.kSR = false;
    if (this.kSP != null)
    {
      this.kSP.notifyDataSetChanged();
      i = this.kSS;
      this.kSS = (i + 1);
      ab.d("MicroMsg.BaseEmojiListAdapter", "xxx data Notify: %d", new Object[] { Integer.valueOf(i) });
    }
    int i = this.kST;
    this.kST = (i + 1);
    ab.v("MicroMsg.BaseEmojiListAdapter", "xxx ui Notify: %d", new Object[] { Integer.valueOf(i) });
    bjv();
  }

  public final void refreshView()
  {
    if (!this.kSR);
    while (true)
    {
      return;
      super.notifyDataSetChanged();
    }
  }

  public abstract void tU(int paramInt);

  public abstract void tV(int paramInt);

  public abstract void tW(int paramInt);

  public f tX(int paramInt)
  {
    if (this.kSP == null);
    for (f localf = null; ; localf = this.kSP.ub(paramInt))
      return localf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.a.a
 * JD-Core Version:    0.6.2
 */