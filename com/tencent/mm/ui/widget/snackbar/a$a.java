package com.tencent.mm.ui.widget.snackbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Queue;

public final class a$a
{
  private int MW;
  private Context mContext;
  String nqb;
  String zTI;
  private int zTJ;
  private Parcelable zTK;
  private short zTL;
  private a zTU;
  private int zTV;

  public a$a(Activity paramActivity)
  {
    AppMethodBeat.i(112976);
    this.zTJ = 0;
    this.zTL = ((short)3500);
    this.MW = -1;
    this.zTV = 0;
    this.mContext = paramActivity.getApplicationContext();
    this.zTU = new a(paramActivity, this.zTV);
    AppMethodBeat.o(112976);
  }

  public a$a(Context paramContext, View paramView)
  {
    AppMethodBeat.i(112977);
    this.zTJ = 0;
    this.zTL = ((short)3500);
    this.MW = -1;
    this.zTV = 0;
    this.mContext = paramContext;
    this.zTU = new a(paramContext, paramView, this.zTV);
    AppMethodBeat.o(112977);
  }

  public final a a(a.b paramb)
  {
    this.zTU.zTO = paramb;
    return this;
  }

  public final a a(a.c paramc)
  {
    this.zTU.zTP = paramc;
    return this;
  }

  public final a a(Short paramShort)
  {
    AppMethodBeat.i(112978);
    this.zTL = paramShort.shortValue();
    AppMethodBeat.o(112978);
    return this;
  }

  public final a dLw()
  {
    AppMethodBeat.i(112979);
    Object localObject1 = this.nqb;
    Object localObject2;
    int i;
    Object localObject3;
    short s;
    if (this.zTI != null)
    {
      localObject2 = this.zTI.toUpperCase();
      i = this.zTJ;
      localObject3 = this.zTK;
      s = this.zTL;
      if (this.MW == -1)
        break label197;
    }
    label197: for (int j = this.MW; ; j = this.mContext.getResources().getColor(2131690683))
    {
      localObject1 = new Snack((String)localObject1, (String)localObject2, i, (Parcelable)localObject3, s, j);
      Object localObject4 = this.zTU;
      if (((a)localObject4).zTN != null)
      {
        localObject2 = ((a)localObject4).zTN;
        localObject3 = ((a)localObject4).mParentView;
        localObject4 = ((a)localObject4).zTP;
        if ((((View)localObject3).getParent() != null) && (((View)localObject3).getParent() != localObject2))
          ((ViewGroup)((View)localObject3).getParent()).removeView((View)localObject3);
        localObject1 = new SnackContainer.a((Snack)localObject1, (View)localObject3, (a.c)localObject4, (byte)0);
        ((SnackContainer)localObject2).zTX.offer(localObject1);
        if (((SnackContainer)localObject2).zTX.size() == 1)
          ((SnackContainer)localObject2).a((SnackContainer.a)localObject1);
      }
      localObject2 = this.zTU;
      AppMethodBeat.o(112979);
      return localObject2;
      localObject2 = null;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.snackbar.a.a
 * JD-Core Version:    0.6.2
 */