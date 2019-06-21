package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.b;
import com.tencent.mm.plugin.sns.model.b.c;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.QFadeImageView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class aq
{
  public static int ruA = -1;
  public static int[] run = { 0, 0, 1, 3, 6, 9 };
  public static int[] ruo = { 2131827766 };
  public static int[] rup = { 2131827766, 2131827893, 2131827894 };
  public static int[] ruq = { 2131827766, 2131827893, 2131827894, 2131827895, 2131827896, 2131827897 };
  public static int[] rur = { 2131827766, 2131827893, 2131827894, 2131827895, 2131827896, 2131827897, 2131827898, 2131827899, 2131827900 };
  static double rus = -1.0D;
  static double rut = -1.0D;
  static double ruu = -1.0D;
  static double ruv = -1.0D;
  static double ruw = -1.0D;
  public static int ruz = -1;
  private Context context;
  private LinkedList<LinearLayout> rux;
  private boolean ruy;

  public aq(Context paramContext)
  {
    AppMethodBeat.i(39115);
    this.rux = new LinkedList();
    if (1 == com.tencent.mm.m.g.Nu().getInt("SnsGroupImageDownloadSwitch", 0))
      bool = true;
    this.ruy = bool;
    this.context = paramContext;
    if (((f.IS_FLAVOR_RED) || (f.DEBUG)) && (-1 == ruz))
    {
      ab.i("MicroMsg.SnsMultiLineImageLineMgr", "inner version, open sns batch image download.");
      ruz = 1;
    }
    AppMethodBeat.o(39115);
  }

  private static void a(bau parambau, QFadeImageView paramQFadeImageView, int paramInt, az paramaz)
  {
    AppMethodBeat.i(39119);
    af.cnC().b(parambau, paramQFadeImageView, paramInt, paramaz);
    AppMethodBeat.o(39119);
  }

  private static void a(bau parambau, QFadeImageView paramQFadeImageView, String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, az paramaz, int paramInt3, boolean paramBoolean2)
  {
    AppMethodBeat.i(39122);
    a(parambau, paramQFadeImageView, paramString, paramInt1, paramInt2, paramBoolean1, paramaz, paramInt3, paramBoolean2, new baw());
    AppMethodBeat.o(39122);
  }

  private static void a(bau parambau, QFadeImageView paramQFadeImageView, String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, az paramaz, int paramInt3, boolean paramBoolean2, baw parambaw)
  {
    AppMethodBeat.i(39121);
    if (paramQFadeImageView == null)
    {
      ab.e("MicroMsg.SnsMultiLineImageLineMgr", "");
      AppMethodBeat.o(39121);
      return;
    }
    ao localao = new ao();
    localao.czD = paramString;
    localao.index = 0;
    paramString = new ArrayList();
    paramString.add(paramQFadeImageView);
    localao.rsl = paramString;
    localao.rps = paramBoolean1;
    localao.position = paramInt2;
    paramQFadeImageView.setTag(localao);
    double d1 = 0.0D;
    double d2 = 0.0D;
    label114: double d4;
    if ((paramInt3 == 10) && (paramBoolean2))
    {
      af.cnC().c(parambau, paramQFadeImageView, paramInt1, paramaz);
      if (parambau.wEK != null)
      {
        d1 = parambau.wEK.wFx;
        d2 = parambau.wEK.wFy;
      }
      if ((d1 <= 0.0D) || (d2 <= 0.0D))
        break label439;
      double d3 = Math.min(rut / d1, rut / d2);
      d4 = d1 * d3;
      d3 = d2 * d3;
      d2 = d3;
      d1 = d4;
      if (d4 < ruu)
      {
        d2 = 1.0D * ruu / d4;
        d1 = d4 * d2;
        d2 = d3 * d2;
      }
      d4 = d2;
      d3 = d1;
      if (d2 < ruu)
      {
        d4 = 1.0D * ruu / d2;
        d3 = d1 * d4;
        d4 = d2 * d4;
      }
      d2 = d3;
      if (d3 > rut)
        d2 = rut;
      d1 = d4;
      if (d4 > rut)
        d1 = rut;
      d4 = d2;
      label308: d2 = d4;
      if (d4 < 1.0D)
        d2 = 1.0D;
      d4 = d1;
      if (d1 < 1.0D)
        d4 = 1.0D;
      if ((parambaw == null) || (parambaw.wFx <= 0.0F) || (parambaw.wFy <= 0.0F))
        break label477;
      d2 = parambaw.wFx;
    }
    label439: label477: for (d1 = parambaw.wFy; ; d1 = d4)
    {
      if ((paramQFadeImageView.getLayoutParams() instanceof FrameLayout.LayoutParams))
      {
        parambau = (FrameLayout.LayoutParams)paramQFadeImageView.getLayoutParams();
        if ((parambau.width == d2) && (parambau.height == d1))
        {
          AppMethodBeat.o(39121);
          break;
          af.cnC().a(parambau, paramQFadeImageView, paramInt1, paramaz);
          break label114;
          d4 = rus;
          d1 = rus;
          break label308;
        }
        paramQFadeImageView.setLayoutParams(new FrameLayout.LayoutParams((int)d2, (int)d1));
      }
      AppMethodBeat.o(39121);
      break;
    }
  }

  private static void a(String paramString, SparseArray<bau> paramSparseArray, SparseArray<View> paramSparseArray1, int paramInt, az paramaz)
  {
    AppMethodBeat.i(39120);
    af.cnC().a(paramString, paramSparseArray, paramSparseArray1, paramInt, paramaz);
    AppMethodBeat.o(39120);
  }

  private boolean ctE()
  {
    boolean bool1 = true;
    AppMethodBeat.i(39118);
    ab.i("MicroMsg.SnsMultiLineImageLineMgr", "enableGroupDownload_cmd: %d.", new Object[] { Integer.valueOf(ruz) });
    boolean bool2;
    switch (ruz)
    {
    default:
      if (-1 != ruA)
      {
        if (1 == ruA)
        {
          bool2 = true;
          this.ruy = bool2;
        }
      }
      else
      {
        bool2 = CdnLogic.getSnsImagePrivateProtocolAvalible();
        ab.d("MicroMsg.SnsMultiLineImageLineMgr", "EnablePrivateProtocol: %s, SnsGroupImageDownloadSwitch: %s.", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(this.ruy) });
        if ((!bool2) || (!this.ruy))
          break label184;
        ab.d("MicroMsg.SnsMultiLineImageLineMgr", "groupDownloadEnable!!!");
        AppMethodBeat.o(39118);
        bool2 = bool1;
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      return bool2;
      ab.i("MicroMsg.SnsMultiLineImageLineMgr", "enforce group download.");
      if (!CdnLogic.getSnsImagePrivateProtocolAvalible())
        CdnLogic.setSnsImagePrivateProtocolAvalible(true);
      AppMethodBeat.o(39118);
      bool2 = bool1;
      continue;
      ab.i("MicroMsg.SnsMultiLineImageLineMgr", "enforce single download.");
      AppMethodBeat.o(39118);
      bool2 = false;
      continue;
      bool2 = false;
      break;
      label184: ab.d("MicroMsg.SnsMultiLineImageLineMgr", "groupDownloadDisable!!!");
      AppMethodBeat.o(39118);
      bool2 = false;
    }
  }

  public final void a(PhotosContent paramPhotosContent, TimeLineObject paramTimeLineObject, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, az paramaz, boolean paramBoolean2)
  {
    AppMethodBeat.i(39116);
    int[] arrayOfInt = rur;
    if ((paramInt2 == 2) || (paramInt2 == 10))
      arrayOfInt = ruo;
    int i;
    while (true)
    {
      paramTimeLineObject = paramTimeLineObject.xfI.wbK;
      if (rus < 0.0D)
      {
        rus = BackwardSupportUtil.b.b(this.context, 160.0F);
        rut = BackwardSupportUtil.b.b(this.context, 200.0F);
        ruu = BackwardSupportUtil.b.b(this.context, 44.0F);
        ruv = BackwardSupportUtil.b.b(this.context, 66.0F);
        ruw = BackwardSupportUtil.b.b(this.context, 300.0F);
      }
      i = paramTimeLineObject.size();
      if (i != 0)
        break label223;
      for (paramInt1 = 0; paramInt1 < arrayOfInt.length; paramInt1++)
      {
        af.cnC().dz(paramPhotosContent.DT(paramInt1));
        paramPhotosContent.DT(paramInt1).setPosition(paramInt3);
      }
      if (paramInt2 == 3)
        arrayOfInt = rup;
      else if (paramInt2 == 4)
        arrayOfInt = ruq;
      else if (paramInt2 == 5)
        arrayOfInt = rur;
    }
    paramPhotosContent.setVisibility(8);
    AppMethodBeat.o(39116);
    while (true)
    {
      return;
      label223: paramPhotosContent.setVisibility(0);
      if (i == 1)
      {
        for (i = 1; i < arrayOfInt.length; i++)
        {
          TagImageView localTagImageView = paramPhotosContent.DT(i);
          localTagImageView.setVisibility(8);
          af.cnC().dz(localTagImageView);
          paramPhotosContent.DT(i).setPosition(paramInt3);
        }
        paramPhotosContent.DT(0).setVisibility(0);
        a((bau)paramTimeLineObject.get(0), paramPhotosContent.DT(0), paramString, paramInt1, paramInt3, paramBoolean1, paramaz, paramInt2, paramBoolean2);
        AppMethodBeat.o(39116);
      }
      else
      {
        AppMethodBeat.o(39116);
      }
    }
  }

  public final void a(PhotosContent paramPhotosContent, TimeLineObject paramTimeLineObject, String paramString1, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, az paramaz, List<baw> paramList, String paramString2)
  {
    AppMethodBeat.i(39117);
    Object localObject1 = rur;
    if ((paramInt2 == 2) || (paramInt2 == 10) || (paramInt2 == 13))
      localObject1 = ruo;
    LinkedList localLinkedList;
    int i;
    while (true)
    {
      localLinkedList = paramTimeLineObject.xfI.wbK;
      if (rus < 0.0D)
      {
        rus = BackwardSupportUtil.b.b(this.context, 160.0F);
        rut = BackwardSupportUtil.b.b(this.context, 200.0F);
        ruu = BackwardSupportUtil.b.b(this.context, 44.0F);
        ruv = BackwardSupportUtil.b.b(this.context, 66.0F);
        ruw = BackwardSupportUtil.b.b(this.context, 300.0F);
      }
      i = localLinkedList.size();
      if (i != 0)
        break label232;
      for (paramInt1 = 0; paramInt1 < localObject1.length; paramInt1++)
      {
        af.cnC().dz(paramPhotosContent.DT(paramInt1));
        paramPhotosContent.DT(paramInt1).setPosition(paramInt3);
      }
      if (paramInt2 == 3)
        localObject1 = rup;
      else if (paramInt2 == 4)
        localObject1 = ruq;
      else if (paramInt2 == 5)
        localObject1 = rur;
    }
    paramPhotosContent.setVisibility(8);
    AppMethodBeat.o(39117);
    while (true)
    {
      return;
      label232: paramPhotosContent.setImageViewWidth(af.cnN());
      paramPhotosContent.setVisibility(0);
      if (i != 1)
        break;
      for (i = 1; i < localObject1.length; i++)
      {
        paramTimeLineObject = paramPhotosContent.DT(i);
        paramTimeLineObject.setVisibility(8);
        af.cnC().dz(paramTimeLineObject);
        paramPhotosContent.DT(i).setPosition(paramInt3);
      }
      paramPhotosContent.DT(0).setVisibility(0);
      if ((paramList != null) && (paramList.size() > 0))
      {
        a((bau)localLinkedList.get(0), paramPhotosContent.DT(0), paramString1, paramInt1, paramInt3, paramBoolean2, paramaz, paramInt2, false, (baw)paramList.get(0));
        AppMethodBeat.o(39117);
      }
      else
      {
        a((bau)localLinkedList.get(0), paramPhotosContent.DT(0), paramString1, paramInt1, paramInt3, paramBoolean2, paramaz, paramInt2, false);
        AppMethodBeat.o(39117);
      }
    }
    if (!ctE());
    for (paramTimeLineObject = new b.c(paramString2, i); ; paramTimeLineObject = null)
    {
      TagImageView localTagImageView;
      Object localObject2;
      if (i == 4)
      {
        localArrayList = new ArrayList();
        paramList = new SparseArray();
        localSparseArray = new SparseArray();
        paramInt2 = localObject1.length - 1;
        i = 3;
        if (paramInt2 >= 0)
        {
          localTagImageView = paramPhotosContent.DT(paramInt2);
          localTagImageView.setPosition(paramInt3);
          if ((paramInt2 == 0) || (paramInt2 == 1) || (paramInt2 == 3) || (paramInt2 == 4))
          {
            localTagImageView.setVisibility(0);
            localArrayList.add(localTagImageView);
            localObject1 = new ao();
            ((ao)localObject1).czD = paramString1;
            ((ao)localObject1).index = i;
            ((ao)localObject1).rsl = localArrayList;
            ((ao)localObject1).rps = paramBoolean2;
            ((ao)localObject1).position = paramInt3;
            localTagImageView.setTag(localObject1);
            if ((paramBoolean1) || (!ctE()))
            {
              localObject2 = (bau)localLinkedList.get(((ao)localObject1).index);
              af.cnA().a(((bau)localObject2).Id, paramTimeLineObject);
              af.cnA().XI(((bau)localObject2).Id);
              a((bau)localObject2, localTagImageView, paramInt1, paramaz);
            }
            paramList.put(((ao)localObject1).index, localLinkedList.get(((ao)localObject1).index));
            localSparseArray.put(((ao)localObject1).index, localTagImageView);
            i--;
          }
          while (true)
          {
            paramInt2--;
            break;
            localTagImageView.setVisibility(8);
            af.cnC().dz(localTagImageView);
          }
        }
        if ((!paramBoolean1) && (ctE()) && (paramList.size() > 0))
          a(paramString2, paramList, localSparseArray, paramInt1, paramaz);
        AppMethodBeat.o(39117);
        break;
      }
      ArrayList localArrayList = new ArrayList();
      paramList = new SparseArray();
      SparseArray localSparseArray = new SparseArray();
      paramInt2 = localObject1.length - 1;
      if (paramInt2 >= 0)
      {
        localTagImageView = paramPhotosContent.DT(paramInt2);
        localTagImageView.setPosition(paramInt3);
        if (paramInt2 < localLinkedList.size())
        {
          localTagImageView.setVisibility(0);
          localArrayList.add(localTagImageView);
          localObject2 = new ao();
          ((ao)localObject2).czD = paramString1;
          ((ao)localObject2).index = paramInt2;
          ((ao)localObject2).rsl = localArrayList;
          ((ao)localObject2).rps = paramBoolean2;
          ((ao)localObject2).position = paramInt3;
          localTagImageView.setTag(localObject2);
          if ((paramBoolean1) || (!ctE()))
          {
            localObject1 = (bau)localLinkedList.get(((ao)localObject2).index);
            af.cnA().a(((bau)localObject1).Id, paramTimeLineObject);
            af.cnA().XI(((bau)localObject1).Id);
            a((bau)localObject1, localTagImageView, paramInt1, paramaz);
          }
          paramList.put(((ao)localObject2).index, localLinkedList.get(((ao)localObject2).index));
          localSparseArray.put(((ao)localObject2).index, localTagImageView);
        }
        while (true)
        {
          paramInt2--;
          break;
          localTagImageView.setVisibility(8);
          af.cnC().dz(localTagImageView);
        }
      }
      if ((!paramBoolean1) && (ctE()) && (paramList.size() > 0))
        a(paramString2, paramList, localSparseArray, paramInt1, paramaz);
      AppMethodBeat.o(39117);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.aq
 * JD-Core Version:    0.6.2
 */