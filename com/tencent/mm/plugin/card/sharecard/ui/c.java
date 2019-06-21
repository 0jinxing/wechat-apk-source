package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.p;

public final class c extends p<ShareCardInfo>
{
  private final String TAG;
  long beginTime;
  long endTime;
  private int kgV;
  com.tencent.mm.plugin.card.base.c kgW;
  private int kgX;

  public c(Context paramContext)
  {
    super(paramContext, new ShareCardInfo());
    AppMethodBeat.i(88140);
    this.TAG = "MicroMsg.ShareCardAdatper";
    this.kgV = 0;
    this.kgX = -1;
    this.beginTime = 0L;
    this.endTime = 0L;
    pN(true);
    this.kgW = new j(paramContext, this);
    AppMethodBeat.o(88140);
  }

  public final void KC()
  {
    AppMethodBeat.i(88142);
    this.beginTime = System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (this.kgX == -1)
    {
      localObject1 = am.bbe();
      localObject2 = n.a.kdK;
      localObject3 = new StringBuilder();
      switch (com.tencent.mm.plugin.card.sharecard.model.k.1.kdd[localObject2.ordinal()])
      {
      default:
        localObject3 = "select * from ShareCardInfo" + ((StringBuilder)localObject3).toString() + " order by status asc , share_time desc";
        localObject1 = ((k)localObject1).bSd.rawQuery((String)localObject3, null);
        if (localObject1 != null)
        {
          this.kgV = ((Cursor)localObject1).getCount();
          ab.i("MicroMsg.ShareCardAdatper", "resetCursor showType %s, card count:%s", new Object[] { Integer.valueOf(this.kgX), Integer.valueOf(this.kgV) });
        }
        break;
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      setCursor((Cursor)localObject1);
      this.endTime = System.currentTimeMillis();
      notifyDataSetChanged();
      AppMethodBeat.o(88142);
      return;
      ((StringBuilder)localObject3).append(" where (status=0 OR status=5)");
      break;
      ((StringBuilder)localObject3).append(" where (status=1 OR status=2 OR status=3 OR status=4 OR status=6)");
      break;
      ((StringBuilder)localObject3).append(" where (status=0 OR status=5) and (block_mask= '1' OR block_mask= '0' )");
      break;
      localObject2 = am.bbe();
      int i = this.kgX;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(" where ( status=0) ");
      localObject3 = "";
      localObject1 = localObject3;
      switch (i)
      {
      default:
        localObject1 = localObject3;
      case 0:
      case 2:
      case 1:
      case 3:
      case 4:
      }
      while (true)
      {
        localObject1 = "select * from ShareCardInfo" + localStringBuilder.toString() + (String)localObject1;
        localObject1 = ((k)localObject2).bSd.rawQuery((String)localObject1, null);
        break;
        localStringBuilder.append(" AND (");
        localStringBuilder.append(" (");
        localStringBuilder.append(k.sT(1));
        localStringBuilder.append(" categoryType= '10' ");
        localStringBuilder.append(") ");
        localStringBuilder.append(" OR (");
        localStringBuilder.append(k.sT(2));
        localStringBuilder.append(" categoryType= '0' ");
        localStringBuilder.append(") ");
        localStringBuilder.append(" )");
        localObject1 = " order by categoryType desc , itemIndex asc";
        continue;
        localStringBuilder.append(" AND ");
        localStringBuilder.append(" (");
        localStringBuilder.append(k.sT(1));
        localStringBuilder.append(" categoryType= '10' ");
        localStringBuilder.append(") ");
        localObject1 = " order by categoryType desc , itemIndex asc";
        continue;
        localStringBuilder.append(" AND ");
        localStringBuilder.append(" (");
        localStringBuilder.append(k.sT(2));
        localStringBuilder.append(" categoryType= '0' ");
        localStringBuilder.append(") ");
        localObject1 = " order by categoryType desc , itemIndex asc";
        continue;
        localStringBuilder.append(" AND 1 != 1 ");
        localObject1 = localObject3;
      }
      ab.e("MicroMsg.ShareCardAdatper", "resetCursor cursor is null, showType %s", new Object[] { Integer.valueOf(this.kgX) });
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(88143);
    bIf();
    KC();
    AppMethodBeat.o(88143);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(88141);
    paramViewGroup = (ShareCardInfo)getItem(paramInt);
    paramView = this.kgW.a(paramInt, paramView, paramViewGroup);
    AppMethodBeat.o(88141);
    return paramView;
  }

  public final void sX(int paramInt)
  {
    AppMethodBeat.i(88144);
    this.kgX = paramInt;
    a(null, null);
    AppMethodBeat.o(88144);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.c
 * JD-Core Version:    0.6.2
 */