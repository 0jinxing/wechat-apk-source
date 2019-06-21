package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView;
import com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView.a;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.v;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UseSparseArrays"})
public class SnsHeader extends LinearLayout
{
  Context context;
  private String cvF;
  boolean czr;
  private Dialog dialog;
  String ecX;
  private String qSf;
  SnsHeader.c rrU;
  private SnsHeader.a rrV;
  private SnsHeader.b rrW;
  private boolean rrX;
  private Map<Integer, View> rrY;
  private String rrZ;
  Bitmap rsa;
  private int type;
  String userName;

  public SnsHeader(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(38951);
    this.rrX = false;
    this.czr = false;
    this.rrY = new HashMap();
    this.rrZ = "";
    this.rsa = null;
    init(paramContext);
    AppMethodBeat.o(38951);
  }

  public SnsHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38952);
    this.rrX = false;
    this.czr = false;
    this.rrY = new HashMap();
    this.rrZ = "";
    this.rsa = null;
    init(paramContext);
    AppMethodBeat.o(38952);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(38957);
    this.context = paramContext;
    View localView = v.hu(paramContext).inflate(2130970765, this, true);
    this.rrU = new SnsHeader.c(this);
    this.rrU.jAJ = ((TextView)localView.findViewById(2131823149));
    this.rrU.eks = ((ImageView)localView.findViewById(2131821183));
    this.rrU.rgK = ((TextView)localView.findViewById(2131827773));
    this.rrU.rsg = ((ImageView)localView.findViewById(2131827771));
    this.rrU.rsh = ((ImageView)localView.findViewById(2131827772));
    this.rrU.rsi = ((LinearLayout)localView.findViewById(2131827780));
    this.rrU.rsj = ((LinearLayout)localView.findViewById(2131827776));
    this.rrU.rsk = ((SnsStoryHeaderView)localView.findViewById(2131827774));
    this.rrU.rsk.setSessionId(this.cvF);
    this.rrU.rsk.setEnterObjectId(this.qSf);
    this.rrU.rsg.setContentDescription(paramContext.getString(2131303601));
    this.rrU.rsg.setOnClickListener(new SnsHeader.1(this, paramContext));
    this.rrU.eks.setOnClickListener(new SnsHeader.2(this, paramContext));
    AppMethodBeat.o(38957);
  }

  public final void cti()
  {
    AppMethodBeat.i(38959);
    Object localObject1 = this.userName;
    if (this.type == 1)
      localObject1 = this.ecX;
    Object localObject2 = af.getAccSnsPath();
    ab.d("MicroMsg.SnsHeader", "MagicAsyncTask ".concat(String.valueOf(localObject1)));
    l locall = af.cnJ().YX((String)localObject1);
    String str1 = locall.field_bgId;
    Object localObject4 = locall.field_older_bgId;
    ab.d("MicroMsg.SnsHeader", "showName " + (String)localObject1 + " get bgId : " + str1 + "  olderBgId：　" + (String)localObject4);
    localObject4 = i.Xc(str1);
    String str2 = (String)localObject1 + "bg_";
    String str3 = (String)localObject1 + "tbg_";
    String str4 = an.fZ((String)localObject2, (String)localObject1);
    e.tf(str4);
    int i;
    String str5;
    if ((locall.field_local_flag & 0x1) > 0)
    {
      i = 1;
      if (i != 0)
      {
        ab.d("MicroMsg.SnsHeader", "bg is change");
        af.cnJ().YW((String)localObject1);
        if (e.ct(an.fZ((String)localObject2, (String)localObject1) + str2))
        {
          e.deleteFile(an.fZ((String)localObject2, (String)localObject1) + str3);
          e.h(an.fZ((String)localObject2, (String)localObject1), str2, str3);
        }
        locall.field_local_flag &= -2;
        af.cnJ().c(locall);
      }
      if ((e.ct(an.fZ(af.getAccSnsPath(), str1) + (String)localObject4)) && (!e.ct(an.fZ((String)localObject2, (String)localObject1) + str2)))
      {
        e.y(an.fZ((String)localObject2, str1) + (String)localObject4, an.fZ((String)localObject2, (String)localObject1) + str2);
        ab.d("MicroMsg.SnsHeader", "nwer id Name update");
      }
      str5 = locall.field_bgUrl;
      if (str1 == null)
        break label882;
      af.cnC();
      localObject2 = str4 + str2;
      this.context.hashCode();
      localObject4 = g.a((String)localObject2, str5, str1, true, az.xYU);
      ab.d("MicroMsg.SnsHeader", "set a new bg");
      localObject2 = localObject4;
      if (localObject4 == null)
        e.deleteFile(str4 + str2);
    }
    label795: label882: Object localObject3;
    for (localObject2 = localObject4; ; localObject3 = null)
    {
      localObject4 = localObject2;
      if (localObject2 == null)
      {
        localObject4 = localObject2;
        if (str1 != null)
        {
          af.cnC();
          localObject2 = str4 + str3;
          this.context.hashCode();
          localObject4 = g.a((String)localObject2, str5, str1, false, az.xYU);
        }
      }
      if (this.rrU.rsg != null)
      {
        this.rrU.rsg.setImageBitmap((Bitmap)localObject4);
        if (localObject4 == null)
          break label795;
        this.rrU.rsg.setBackgroundDrawable(null);
      }
      while (true)
      {
        this.rrU.rsi.setVisibility(8);
        if ((localObject4 == null) && ((this.type == 1) || (this.ecX.equals(localObject1))))
          this.rrU.rsi.setVisibility(0);
        this.rrX = locall.cqJ();
        if (this.rrW != null)
        {
          this.rrW.aa((Bitmap)localObject4);
          if (localObject4 != null)
          {
            int j = a.fromDPToPix(this.context, 65);
            i = j;
            if (j > ((Bitmap)localObject4).getHeight())
              i = ((Bitmap)localObject4).getHeight();
            localObject1 = new SnsHeader.3(this, com.tencent.mm.ui.ae.ao(Bitmap.createBitmap(localObject4, 0, 0, localObject4.getWidth(), i))[0]);
            localObject2 = new PaintDrawable();
            ((PaintDrawable)localObject2).setShape(new RectShape());
            ((PaintDrawable)localObject2).setShaderFactory((ShapeDrawable.ShaderFactory)localObject1);
            this.rrU.rsh.setBackground((Drawable)localObject2);
          }
        }
        AppMethodBeat.o(38959);
        return;
        i = 0;
        break;
        try
        {
          if ((this.rsa == null) || (this.rsa.isRecycled()))
          {
            ab.i("MicroMsg.SnsHeader", "decode bitmap by self");
            this.rsa = d.decodeStream(this.context.getAssets().open("resource/friendactivity_mycover_bg.jpg"));
          }
          localObject2 = new android/graphics/drawable/BitmapDrawable;
          ((BitmapDrawable)localObject2).<init>(this.rsa);
          this.rrU.rsg.setBackgroundDrawable((Drawable)localObject2);
        }
        catch (IOException localIOException)
        {
          ab.printErrStackTrace("MicroMsg.SnsHeader", localIOException, "", new Object[0]);
        }
      }
    }
  }

  public final boolean ctj()
  {
    boolean bool1 = false;
    AppMethodBeat.i(38960);
    if (this.rrU.rsj == null)
      AppMethodBeat.o(38960);
    while (true)
    {
      return bool1;
      Object localObject1 = aj.cnX();
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      boolean bool2;
      while (true)
        if (i < ((List)localObject1).size())
        {
          localObject2 = (n)((List)localObject1).get(i);
          try
          {
            bav localbav = new com/tencent/mm/protocal/protobuf/bav;
            localbav.<init>();
            bool2 = ((bav)localbav.parseFrom(((n)localObject2).field_postBuf)).wFv;
            if (bool2)
              i++;
          }
          catch (Exception localException2)
          {
            while (true)
              localLinkedList.add(localObject2);
          }
        }
      Object localObject2 = "";
      i = 0;
      Object localObject3;
      while (true)
        if (i < localLinkedList.size())
        {
          localObject1 = (n)localLinkedList.get(i);
          try
          {
            localObject3 = new com/tencent/mm/protocal/protobuf/bav;
            ((bav)localObject3).<init>();
            bool2 = ((bav)((bav)localObject3).parseFrom(((n)localObject1).field_postBuf)).wFv;
            if (bool2)
              i++;
          }
          catch (Exception localException1)
          {
            while (true)
              localObject2 = (String)localObject2 + ((n)localLinkedList.get(i)).cqU() + " ";
          }
        }
      ab.i("MicroMsg.SnsHeader", "refreshError %s %s %s", new Object[] { Integer.valueOf(localLinkedList.size()), localObject2, this.rrZ });
      if (((String)localObject2).equals(this.rrZ))
      {
        if (localLinkedList.size() > 0)
        {
          AppMethodBeat.o(38960);
          bool1 = true;
        }
        else
        {
          AppMethodBeat.o(38960);
        }
      }
      else
      {
        this.rrZ = ((String)localObject2);
        this.rrU.rsj.removeAllViews();
        localObject2 = this.rrU.rsj;
        label366: int j;
        int k;
        label454: LinearLayout localLinearLayout;
        if (localLinkedList.size() > 0)
        {
          i = 0;
          ((LinearLayout)localObject2).setVisibility(i);
          Collections.sort(localLinkedList, new SnsHeader.d(this));
          i = 0;
          if (i >= localLinkedList.size())
            break label623;
          j = ((n)localLinkedList.get(i)).reX;
          k = localLinkedList.size();
          if ((!this.rrY.containsKey(Integer.valueOf(j))) || (this.rrY.get(Integer.valueOf(j)) == null))
            break label549;
          localObject2 = (View)this.rrY.get(Integer.valueOf(j));
          localLinearLayout = (LinearLayout)localObject2;
          localLinearLayout.getChildAt(0).setTag(((n)localLinkedList.get(i)).cqU());
          localObject2 = (n)localLinkedList.get(i);
          localObject3 = (TextView)localLinearLayout.findViewById(2131824845);
          if (((n)localObject2).field_type != 15)
            break label609;
          ((TextView)localObject3).setText(2131303748);
        }
        while (true)
        {
          this.rrU.rsj.addView(localLinearLayout);
          i++;
          break label366;
          i = 8;
          break;
          label549: localObject2 = (LinearLayout)v.hu(this.context).inflate(2130969817, null);
          ((LinearLayout)localObject2).getChildAt(0).setOnClickListener(new SnsHeader.4(this, k, i));
          this.rrY.put(Integer.valueOf(j), localObject2);
          break label454;
          label609: ((TextView)localObject3).setTag(Integer.valueOf(2131303743));
        }
        label623: if (localLinkedList.size() > 0)
        {
          AppMethodBeat.o(38960);
          bool1 = true;
        }
        else
        {
          AppMethodBeat.o(38960);
        }
      }
    }
  }

  public void setAvatarOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(38958);
    if ((this.rrU != null) && (this.rrU.eks != null))
      this.rrU.eks.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(38958);
  }

  public void setBackClickListener(SnsHeader.a parama)
  {
    this.rrV = parama;
  }

  public void setEnterObjectId(String paramString)
  {
    AppMethodBeat.i(38956);
    this.qSf = paramString;
    if ((this.rrU != null) && (this.rrU.rsk != null))
      this.rrU.rsk.setEnterObjectId(paramString);
    AppMethodBeat.o(38956);
  }

  public void setHeadBgListener(SnsHeader.b paramb)
  {
    this.rrW = paramb;
  }

  public void setSessionId(String paramString)
  {
    AppMethodBeat.i(38955);
    this.cvF = paramString;
    if ((this.rrU != null) && (this.rrU.rsk != null))
      this.rrU.rsk.setSessionId(paramString);
    AppMethodBeat.o(38955);
  }

  public void setStoryAction(SnsStoryHeaderView.a parama)
  {
    AppMethodBeat.i(38954);
    if ((this.rrU != null) && (this.rrU.rsk != null))
      this.rrU.rsk.setStoryAction(parama);
    AppMethodBeat.o(38954);
  }

  public void setType(int paramInt)
  {
    AppMethodBeat.i(38953);
    this.type = paramInt;
    if ((paramInt == 1) && (this.rrU.rgK != null))
      this.rrU.rgK.setVisibility(8);
    if ((this.rrU != null) && (this.rrU.rsk != null))
      this.rrU.rsk.setSnsType(paramInt);
    AppMethodBeat.o(38953);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsHeader
 * JD-Core Version:    0.6.2
 */