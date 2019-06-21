package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.api.h;
import com.tencent.mm.api.i;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class g
  implements q
{
  private static int[] vkg = { 2131822940, 2131822941, 2131822942, 2131822943, 2131822944, 2131822945, 2131822946, 2131822947, 2131822948 };

  public static com.tencent.mm.ui.base.o a(com.tencent.mm.ui.q paramq, long paramLong, String paramString1, String paramString2, String paramString3, q.a parama)
  {
    AppMethodBeat.i(27692);
    View localView = ah(paramq.ylL, 2130969188);
    com.tencent.mm.ui.base.o localo = es(localView);
    a(localView, parama, localo);
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.MMConfirmDialog", "showDialogItem8 fail,title or  message is empty");
      paramq = null;
      AppMethodBeat.o(27692);
      return paramq;
    }
    a(localView, 2131822928, paramString1, false, 0);
    NoMeasuredTextView localNoMeasuredTextView = (NoMeasuredTextView)localView.findViewById(2131822923);
    localNoMeasuredTextView.setShouldEllipsize(true);
    localNoMeasuredTextView.setTextSize(0, paramq.ylL.getResources().getDimension(2131427505) * com.tencent.mm.bz.a.dm(paramq.ylL));
    localNoMeasuredTextView.setTextColor(com.tencent.mm.bz.a.h(paramq.ylL, 2131690316));
    Object localObject = ((h)com.tencent.mm.kernel.g.K(h.class)).aK(paramLong);
    String str1;
    if ((localObject != null) && (((com.tencent.mm.aj.a.c)localObject).isGroup()))
    {
      paramString1 = ((com.tencent.mm.aj.a.c)localObject).field_chatName;
      str1 = ((com.tencent.mm.aj.a.c)localObject).field_headImageUrl;
      localObject = ((com.tencent.mm.aj.a.c)localObject).field_brandUserName;
      label174: String str2 = paramString1;
      if (paramString1 == null)
        str2 = paramString2;
      if (bo.isNullOrNil(str2))
        break label414;
      localNoMeasuredTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramq.ylL, str2, localNoMeasuredTextView.getTextSize()));
    }
    while (true)
    {
      a(localView, 2131822933, null, true, 8);
      paramString1 = (Button)localView.findViewById(2131822915);
      if (!bo.isNullOrNil(paramString3))
        paramString1.setText(paramString3);
      paramString1.setOnClickListener(new g.16(parama, localView, localo));
      paramString1 = new com.tencent.mm.at.a.a.c.a();
      paramString1.ePK = com.tencent.mm.api.a.cC((String)localObject);
      paramString1.ePH = true;
      paramString1.ePZ = true;
      paramString1.ePT = 2131231172;
      paramString1 = paramString1.ahG();
      if (!bo.isNullOrNil(str1))
        com.tencent.mm.at.o.ahp().a(str1, (ImageView)localView.findViewById(2131822922), paramString1);
      a(paramq, localo);
      AppMethodBeat.o(27692);
      paramq = localo;
      break;
      localObject = ((i)com.tencent.mm.kernel.g.K(i.class)).cH(((com.tencent.mm.aj.a.c)localObject).field_bizChatServId);
      if (localObject != null)
      {
        paramString1 = ((com.tencent.mm.aj.a.j)localObject).field_userName;
        str1 = ((com.tencent.mm.aj.a.j)localObject).field_headImageUrl;
        localObject = ((com.tencent.mm.aj.a.j)localObject).field_brandUserName;
        break label174;
      }
      ab.w("MicroMsg.MMConfirmDialog", "showDialogItem8 userInfo is null");
      paramq = null;
      AppMethodBeat.o(27692);
      break;
      label414: localNoMeasuredTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramq.ylL, paramString2, localNoMeasuredTextView.getTextSize()));
    }
  }

  public static com.tencent.mm.ui.base.o a(com.tencent.mm.ui.q paramq, Bitmap paramBitmap, String paramString, q.a parama)
  {
    AppMethodBeat.i(27690);
    final View localView = ah(paramq.ylL, 2130969187);
    final com.tencent.mm.ui.base.o localo = es(localView);
    a(localView, parama, localo);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.MMConfirmDialog", "showDialogItem7 fail, message is empty");
      paramq = null;
      AppMethodBeat.o(27690);
      return paramq;
    }
    Object localObject = (TextView)localView.findViewById(2131822923);
    ((TextView)localObject).setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramq.ylL, paramString, ((TextView)localObject).getTextSize()));
    localObject = (Button)localView.findViewById(2131822915);
    paramString = (ImageView)localView.findViewById(2131822922);
    if (paramString != null)
    {
      if ((paramBitmap == null) || (paramBitmap.isRecycled()))
        break label178;
      paramString.setImageBitmap(paramBitmap);
      localo.setOnDismissListener(new g.8(paramBitmap));
    }
    while (true)
    {
      ((Button)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(27652);
          if (this.vkj != null)
            this.vkj.a(true, g.et(localView), g.eu(localView));
          localo.dismiss();
          localo.setFocusable(false);
          localo.setTouchable(false);
          AppMethodBeat.o(27652);
        }
      });
      a(paramq, localo);
      AppMethodBeat.o(27690);
      paramq = localo;
      break;
      label178: paramString.setVisibility(8);
    }
  }

  public static com.tencent.mm.ui.base.o a(com.tencent.mm.ui.q paramq, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, q.a parama)
  {
    AppMethodBeat.i(27691);
    final View localView = ah(paramq.ylL, 2130969188);
    final com.tencent.mm.ui.base.o localo = es(localView);
    a(localView, parama, localo);
    if (bo.isNullOrNil(paramString2))
    {
      ab.e("MicroMsg.MMConfirmDialog", "showDialogItem8 fail,title or  message is empty");
      paramq = null;
      AppMethodBeat.o(27691);
      return paramq;
    }
    a(localView, 2131822928, paramString2, false, 0);
    paramString2 = (NoMeasuredTextView)localView.findViewById(2131822923);
    paramString2.setShouldEllipsize(true);
    paramString2.setTextSize(0, paramq.ylL.getResources().getDimension(2131427505) * com.tencent.mm.bz.a.dm(paramq.ylL));
    paramString2.setTextColor(com.tencent.mm.bz.a.h(paramq.ylL, 2131690316));
    if (!bo.isNullOrNil(paramString1))
      paramString2.setText(((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.a.class)).b(paramq.ylL, ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(paramString1), paramString2.getTextSize()));
    while (true)
    {
      a(localView, 2131822933, paramString4, true, 8);
      paramString2 = (Button)localView.findViewById(2131822915);
      if (!bo.isNullOrNil(paramString5))
        paramString2.setText(paramString5);
      paramString2.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(27653);
          if (this.vkj != null)
            this.vkj.a(true, g.et(localView), g.eu(localView));
          localo.dismiss();
          localo.setFocusable(false);
          localo.setTouchable(false);
          AppMethodBeat.o(27653);
        }
      });
      if (!bo.isNullOrNil(paramString1))
        a.b.b((ImageView)localView.findViewById(2131822922), paramString1);
      a(paramq, localo);
      AppMethodBeat.o(27691);
      paramq = localo;
      break;
      paramString2.setText(((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.a.class)).b(paramq.ylL, paramString3, paramString2.getTextSize()));
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, int paramInt, String paramString, boolean paramBoolean, q.a parama)
  {
    AppMethodBeat.i(27684);
    paramq = a(paramq, paramInt, paramString, paramBoolean, "", parama);
    AppMethodBeat.o(27684);
    return paramq;
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, int paramInt, String paramString1, boolean paramBoolean, String paramString2, q.a parama)
  {
    AppMethodBeat.i(27685);
    com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(paramq.ylL);
    Object localObject = paramq.ylL.getIntent().getExtras().getString("Select_Conv_User", null);
    if (localObject != null)
    {
      localObject = bo.P(((String)localObject).split(","));
      a(paramq.ylL, locala, localObject);
    }
    locala.ra(true);
    if (paramInt == 2131230795)
      localObject = paramq.ylL.getResources().getString(2131296942);
    while (true)
    {
      locala.ak((String)localObject + paramString1).rc(false).rd(false);
      if (paramBoolean)
        locala.rb(true);
      paramString1 = locala.aMb();
      a(paramq.ylL, paramString1, paramString2, null, parama, parama);
      paramString1.show();
      AppMethodBeat.o(27685);
      return paramString1;
      if (paramInt == 2131230800)
        localObject = paramq.ylL.getResources().getString(2131296980);
      else if (paramInt == 2131230817)
        localObject = paramq.ylL.getResources().getString(2131297076);
      else
        localObject = paramq.ylL.getResources().getString(2131296527);
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, Bitmap paramBitmap, String paramString1, String paramString2, String paramString3, q.a parama)
  {
    AppMethodBeat.i(27688);
    View localView = ah(paramq.ylL, 2130969185);
    com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(paramq.ylL);
    locala.rc(false);
    locala.rd(false);
    u(localView, true);
    a(paramq, locala, parama, localView, paramq.ylL.getResources().getString(2131298423));
    parama = (TextView)localView.findViewById(2131822928);
    parama.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramq.ylL, paramString1, parama.getTextSize()));
    paramString1 = (TextView)localView.findViewById(2131822923);
    paramString1.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramq.ylL, paramString2, paramString1.getTextSize()));
    paramq = (TextView)localView.findViewById(2131822924);
    if ((paramString3 == null) || (paramString3.length() == 0))
    {
      paramq.setVisibility(8);
      paramq = (ImageView)localView.findViewById(2131822922);
      if (paramq != null)
      {
        if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
          break label242;
        ab.w("MicroMsg.MMConfirmDialog", "showDialogItem4, thumbBmp is null or recycled");
        paramq.setVisibility(8);
      }
    }
    while (true)
    {
      locala.fn(localView);
      paramq = locala.aMb();
      paramq.show();
      AppMethodBeat.o(27688);
      return paramq;
      paramq.setText(paramString3);
      paramq.setVisibility(0);
      break;
      label242: paramq.setVisibility(0);
      paramq.setImageBitmap(paramBitmap);
      a(locala, paramBitmap);
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, String paramString1, Bitmap paramBitmap, String paramString2, String paramString3, q.a parama)
  {
    AppMethodBeat.i(27689);
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString2 == null) || (paramString2.length() == 0)))
    {
      ab.e("MicroMsg.MMConfirmDialog", "showDialogItem6 fail, title message both are empty");
      paramq = null;
      AppMethodBeat.o(27689);
      return paramq;
    }
    View localView = ah(paramq.ylL, 2130969186);
    com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(paramq.ylL);
    locala.rc(false);
    locala.rd(false);
    u(localView, false);
    a(paramq, locala, parama, localView, paramq.ylL.getResources().getString(2131298450));
    parama = (TextView)localView.findViewById(2131822928);
    parama.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramq.ylL, paramString1, parama.getTextSize()));
    paramString1 = (TextView)localView.findViewById(2131822923);
    paramString1.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramq.ylL, paramString2, paramString1.getTextSize()));
    if (paramString3.length() == 0)
    {
      localView.findViewById(2131822924).setVisibility(8);
      label192: paramq = (ImageView)localView.findViewById(2131822922);
      if (paramq != null)
      {
        if ((paramBitmap == null) || (paramBitmap.isRecycled()))
          break label275;
        paramq.setImageBitmap(paramBitmap);
        a(locala, paramBitmap);
      }
    }
    while (true)
    {
      locala.fn(localView);
      paramq = locala.aMb();
      paramq.show();
      AppMethodBeat.o(27689);
      break;
      ((TextView)localView.findViewById(2131822924)).setText(paramString3);
      break label192;
      label275: paramq.setVisibility(4);
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, String paramString1, View paramView, String paramString2, q.b paramb)
  {
    AppMethodBeat.i(27694);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      ab.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
      paramq = null;
      AppMethodBeat.o(27694);
    }
    while (true)
    {
      return paramq;
      com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(paramq.ylL);
      locala.rc(false);
      locala.rd(false);
      a(locala, paramq.ylL, paramString1);
      if (!bo.isNullOrNil(paramString2))
      {
        paramString1 = paramString2;
        if (paramString2.length() != 0);
      }
      else
      {
        paramString1 = paramq.ylL.getResources().getString(2131298423);
      }
      locala.asJ(paramString1).a(new g.3(paramb));
      locala.Qd(2131296868).b(new g.4(paramb));
      locala.fn(paramView);
      paramString1 = locala.aMb();
      paramString1.PT(paramq.ylL.getResources().getColor(2131689776));
      paramString1.show();
      AppMethodBeat.o(27694);
      paramq = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, String paramString1, String paramString2, q.a parama)
  {
    AppMethodBeat.i(27677);
    paramq = a(paramq, paramString1, paramString2, false, "", parama);
    AppMethodBeat.o(27677);
    return paramq;
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4, q.a parama)
  {
    View localView = null;
    AppMethodBeat.i(27673);
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString3 == null) || (paramString3.length() == 0)))
    {
      ab.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
      AppMethodBeat.o(27673);
      paramq = localView;
    }
    while (true)
    {
      return paramq;
      localView = View.inflate(paramq.ylL, 2130969184, null);
      com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(paramq.ylL);
      locala.rc(false);
      locala.rd(false);
      a(locala, paramq.ylL, paramString1);
      u(localView, paramBoolean);
      a(paramq, locala, parama, localView, paramString4);
      paramString1 = (TextView)localView.findViewById(2131822923);
      paramString1.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramq.ylL, paramString3, paramString1.getTextSize()));
      localView.findViewById(2131822924).setVisibility(8);
      int i = BackwardSupportUtil.b.b(paramq.ylL, 120.0F);
      paramq = (CdnImageView)localView.findViewById(2131822922);
      if (paramq != null)
        paramq.am(paramString2, i, i);
      locala.fn(localView);
      paramq = locala.aMb();
      paramq.show();
      AppMethodBeat.o(27673);
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, String paramString1, String paramString2, boolean paramBoolean, String paramString3, q.a parama)
  {
    AppMethodBeat.i(27674);
    paramq = a(paramq, paramString1, paramString2, paramBoolean, paramString3, parama, paramq.ylL.getResources().getString(2131297071));
    AppMethodBeat.o(27674);
    return paramq;
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, String paramString1, String paramString2, boolean paramBoolean, String paramString3, q.a parama, String paramString4)
  {
    AppMethodBeat.i(27675);
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString2 == null) || (paramString2.length() == 0)))
    {
      ab.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
      AppMethodBeat.o(27675);
    }
    for (paramq = null; ; paramq = paramString1)
    {
      return paramq;
      paramString2 = new com.tencent.mm.ui.widget.a.c.a(paramq.ylL);
      Object localObject = paramq.ylL.getIntent().getExtras().getString("Select_Conv_User", null);
      if (localObject != null)
      {
        localObject = bo.P(((String)localObject).split(","));
        a(paramq.ylL, paramString2, localObject);
      }
      paramString2.ra(true);
      paramString2.ak(paramString4 + paramString1).rc(false).rd(false);
      if (paramBoolean)
        paramString2.rb(true);
      paramString1 = paramString2.aMb();
      a(paramq.ylL, paramString1, paramString3, null, parama, parama);
      paramString1.show();
      AppMethodBeat.o(27675);
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, String paramString, boolean paramBoolean, int paramInt, q.a parama)
  {
    AppMethodBeat.i(27686);
    paramq = a(paramq, paramString, paramBoolean, paramInt, "", parama);
    AppMethodBeat.o(27686);
    return paramq;
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, String paramString1, boolean paramBoolean, int paramInt, String paramString2, q.a parama)
  {
    AppMethodBeat.i(27687);
    com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(paramq.ylL);
    Object localObject = paramq.ylL.getIntent().getExtras().getString("Select_Conv_User", null);
    if (localObject != null);
    for (localObject = bo.P(((String)localObject).split(",")); ; localObject = null)
    {
      a(paramq.ylL, locala, localObject);
      locala.ra(true);
      switch (paramInt)
      {
      default:
        localObject = paramq.ylL.getResources().getString(2131296527);
      case 1:
      case 2:
      }
      while (true)
      {
        locala.ak((String)localObject + paramString1).rc(false).rd(false);
        if (paramBoolean)
          locala.rb(true);
        paramString1 = locala.aMb();
        a(paramq.ylL, paramString1, paramString2, null, parama, parama);
        paramString1.show();
        AppMethodBeat.o(27687);
        return paramString1;
        localObject = paramq.ylL.getResources().getString(2131297076);
        continue;
        localObject = paramq.ylL.getResources().getString(2131296980);
      }
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, String paramString, boolean paramBoolean, q.a parama)
  {
    AppMethodBeat.i(27678);
    paramq = a(paramq, paramString, paramBoolean, "", parama);
    AppMethodBeat.o(27678);
    return paramq;
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, String paramString1, boolean paramBoolean, String paramString2, q.a parama)
  {
    AppMethodBeat.i(27679);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      ab.e("MicroMsg.MMConfirmDialog", "showDialogItem2 fail, message is empty");
      AppMethodBeat.o(27679);
    }
    for (paramq = null; ; paramq = paramString1)
    {
      return paramq;
      com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(paramq.ylL);
      Object localObject = paramq.ylL.getIntent().getExtras().getString("Select_Conv_User", null);
      if (localObject != null)
      {
        localObject = bo.P(((String)localObject).split(","));
        a(paramq.ylL, locala, localObject);
      }
      locala.ra(true);
      locala.ak(paramString1).rc(false).rd(false);
      if (paramBoolean)
        locala.rb(true);
      paramString1 = locala.aMb();
      a(paramq.ylL, paramString1, paramString2, null, parama, parama);
      paramString1.show();
      AppMethodBeat.o(27679);
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, byte[] paramArrayOfByte, boolean paramBoolean, q.a parama)
  {
    AppMethodBeat.i(27682);
    paramq = a(paramq, paramArrayOfByte, paramBoolean, "", parama);
    AppMethodBeat.o(27682);
    return paramq;
  }

  public static com.tencent.mm.ui.widget.a.c a(com.tencent.mm.ui.q paramq, byte[] paramArrayOfByte, boolean paramBoolean, String paramString, q.a parama)
  {
    AppMethodBeat.i(27683);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      ab.e("MicroMsg.MMConfirmDialog", "showDialogItem3 fail, imgData is null");
      AppMethodBeat.o(27683);
    }
    for (paramq = null; ; paramq = paramArrayOfByte)
    {
      return paramq;
      com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(paramq.ylL);
      Object localObject = paramq.ylL.getIntent().getExtras().getString("Select_Conv_User", null);
      if (localObject != null)
      {
        localObject = bo.P(((String)localObject).split(","));
        a(paramq.ylL, locala, localObject);
      }
      locala.ra(true);
      locala.rc(false).rd(false);
      if (paramBoolean)
        locala.rb(true);
      if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
      {
        localObject = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
        int i = com.tencent.util.d.cs(paramArrayOfByte);
        if (localObject != null)
        {
          paramArrayOfByte = (byte[])localObject;
          if (i != 0)
            paramArrayOfByte = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject, i);
          locala.a(paramArrayOfByte, true, 3);
          a(locala, paramArrayOfByte);
          locala.ra(false);
        }
      }
      paramArrayOfByte = locala.aMb();
      a(paramq.ylL, paramArrayOfByte, paramString, null, parama, parama);
      paramArrayOfByte.show();
      AppMethodBeat.o(27683);
    }
  }

  private static void a(Context paramContext, com.tencent.mm.ui.widget.a.c.a parama, Object paramObject)
  {
    AppMethodBeat.i(27670);
    if (paramObject != null)
      if ((paramObject instanceof String))
        paramObject = bo.P(((String)paramObject).split(","));
    while (true)
    {
      if (bo.ek(paramObject))
        AppMethodBeat.o(27670);
      while (true)
      {
        return;
        if (!(paramObject instanceof List))
          break label557;
        paramObject = (List)paramObject;
        break;
        if (paramObject.size() == 1)
        {
          paramObject = (String)paramObject.get(0);
          int i = com.tencent.mm.bz.a.fromDPToPix(paramContext, (int)(20.0F * com.tencent.mm.bz.a.dm(paramContext)));
          Object localObject1 = paramContext.getString(2131302496);
          parama.ai(((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.a.class)).a(paramContext, ((String)localObject1).toString(), i)).PY(3);
          Object localObject2 = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(paramObject);
          i = com.tencent.mm.bz.a.fromDPToPix(paramContext, (int)(14.0F * com.tencent.mm.bz.a.dm(paramContext)));
          if (t.kH(paramObject))
          {
            localObject1 = paramContext.getString(2131302883, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.chatroom.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.b.class)).mA(paramObject)) });
            localObject1 = (String)localObject2 + (String)localObject1;
            localObject2 = ((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.a.class)).a(paramContext, ((String)localObject1).toString(), i);
            View localView = v.hu(paramContext).inflate(2130969289, null);
            GridView localGridView = (GridView)localView.findViewById(2131823307);
            ArrayList localArrayList = new ArrayList();
            localObject1 = ((com.tencent.mm.plugin.chatroom.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.b.class)).my(paramObject);
            parama.a(paramObject, (CharSequence)localObject2, Boolean.TRUE, new g.1(localView, localArrayList, paramObject, (List)localObject1), new g.7());
            localGridView.setAdapter(new l(paramContext, (List)localObject1, localArrayList));
            localGridView.setSelector(new ColorDrawable(paramContext.getResources().getColor(2131690597)));
            if (localObject1 != null)
            {
              if (((List)localObject1).size() <= 16)
                break label452;
              localGridView.setLayoutParams(new LinearLayout.LayoutParams(-1, com.tencent.mm.bz.a.al(paramContext, 2131427576)));
              localGridView.setPadding(com.tencent.mm.bz.a.al(paramContext, 2131427572), 0, com.tencent.mm.bz.a.al(paramContext, 2131427572), 0);
            }
            while (true)
            {
              parama.zQe.zPt = localView;
              AppMethodBeat.o(27670);
              break;
              label452: localGridView.setPadding(0, 0, 0, com.tencent.mm.bz.a.al(paramContext, 2131427569));
            }
          }
          parama.a(paramObject, ((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.a.class)).a(paramContext, ((String)localObject2).toString(), i), Boolean.FALSE, null, new g.11());
          AppMethodBeat.o(27670);
        }
        else
        {
          paramObject = d(paramContext, paramObject);
          parama.zQe.zPs = paramObject;
          parama.asD(paramContext.getString(2131301516)).PY(3);
          AppMethodBeat.o(27670);
        }
      }
      label557: paramObject = null;
    }
  }

  private static void a(Context paramContext, com.tencent.mm.ui.widget.a.c paramc, String paramString1, String paramString2, final q.a parama1, final q.a parama2)
  {
    AppMethodBeat.i(27672);
    if (!bo.isNullOrNil(paramString1))
    {
      paramString2 = paramString1;
      if (paramString1.length() != 0);
    }
    else
    {
      paramString2 = paramContext.getResources().getString(2131298423);
    }
    if (!bo.isNullOrNil(null))
      throw new NullPointerException();
    paramContext = paramContext.getResources().getString(2131296868);
    paramc.a(paramString2, true, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(27650);
        this.jEA.dismiss();
        if (parama1 != null)
          parama1.a(true, this.jEA.dKV(), this.jEA.dKW());
        AppMethodBeat.o(27650);
      }
    });
    paramc.b(paramContext, true, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(27651);
        this.jEA.dismiss();
        if (parama2 != null)
          parama2.a(false, null, 0);
        AppMethodBeat.o(27651);
      }
    });
    AppMethodBeat.o(27672);
  }

  private static void a(View paramView, int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(27701);
    paramView = (TextView)paramView.findViewById(paramInt1);
    boolean bool;
    if (paramView != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if ((!paramBoolean) || (!bo.isNullOrNil(paramString)))
        break label57;
      paramView.setVisibility(paramInt2);
      AppMethodBeat.o(27701);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label57: paramView.setText(paramString);
      AppMethodBeat.o(27701);
    }
  }

  private static void a(View paramView, q.a parama, final com.tencent.mm.ui.base.o paramo)
  {
    AppMethodBeat.i(27699);
    ((Button)paramView.findViewById(2131822915)).setOnClickListener(new g.5(parama, paramView, paramo));
    paramView = (Button)paramView.findViewById(2131822914);
    if (paramView != null)
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(27644);
          if (this.vkj != null)
            this.vkj.a(false, null, 0);
          paramo.dismiss();
          paramo.setFocusable(false);
          paramo.setTouchable(false);
          AppMethodBeat.o(27644);
        }
      });
    AppMethodBeat.o(27699);
  }

  private static void a(com.tencent.mm.ui.q paramq, com.tencent.mm.ui.base.o paramo)
  {
    AppMethodBeat.i(27702);
    try
    {
      if (!paramq.ylL.isFinishing())
      {
        paramo.setInputMethodMode(1);
        paramo.setSoftInputMode(16);
        paramo.setFocusable(true);
        paramo.setTouchable(true);
        paramo.showAtLocation(paramq.ylL.getWindow().getDecorView(), 17, 0, 0);
      }
      AppMethodBeat.o(27702);
      return;
    }
    catch (Exception paramq)
    {
      while (true)
      {
        ab.e("MicroMsg.MMConfirmDialog", "show dialog fail: %s", new Object[] { paramq.getMessage() });
        ab.printErrStackTrace("MicroMsg.MMConfirmDialog", paramq, "", new Object[0]);
        AppMethodBeat.o(27702);
      }
    }
  }

  private static void a(com.tencent.mm.ui.q paramq, com.tencent.mm.ui.widget.a.c.a parama, q.a parama1, View paramView, String paramString)
  {
    AppMethodBeat.i(27697);
    String str;
    if (!bo.isNullOrNil(paramString))
    {
      str = paramString;
      if (paramString.length() != 0);
    }
    else
    {
      str = paramq.ylL.getResources().getString(2131298423);
    }
    parama.asJ(str).a(new g.17(parama1, paramView));
    parama.Qd(2131296868).b(new g.2(parama1));
    AppMethodBeat.o(27697);
  }

  public static void a(com.tencent.mm.ui.q paramq, String paramString1, String paramString2, String paramString3, q.a parama)
  {
    AppMethodBeat.i(27693);
    paramq = new g.a(paramq.ylL).cx(paramString1).ajC(paramString2).h(Boolean.FALSE);
    paramq.vkn = paramString3;
    paramq.a(parama).gud.show();
    AppMethodBeat.o(27693);
  }

  private static void a(com.tencent.mm.ui.widget.a.c.a parama, Context paramContext, String paramString)
  {
    AppMethodBeat.i(27698);
    parama.asD(paramString);
    parama.PW(paramContext.getResources().getColor(2131690316));
    parama.PX(2);
    AppMethodBeat.o(27698);
  }

  private static void a(com.tencent.mm.ui.widget.a.c.a parama, Bitmap paramBitmap)
  {
    AppMethodBeat.i(27703);
    parama.a(new g.9(paramBitmap));
    AppMethodBeat.o(27703);
  }

  private static View ah(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(27695);
    paramContext = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(paramInt, null);
    AppMethodBeat.o(27695);
    return paramContext;
  }

  public static com.tencent.mm.ui.widget.a.c b(com.tencent.mm.ui.q paramq, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, q.a parama)
  {
    View localView = null;
    AppMethodBeat.i(27676);
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString3 == null) || (paramString3.length() == 0)))
    {
      ab.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
      AppMethodBeat.o(27676);
      paramq = localView;
    }
    while (true)
    {
      return paramq;
      localView = View.inflate(paramq.ylL, 2130969184, null);
      com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(paramq.ylL);
      locala.rc(false);
      locala.rd(false);
      a(locala, paramq.ylL, paramString1);
      if (localView != null)
      {
        paramString1 = (EditText)localView.findViewById(2131822921);
        if (paramString1 != null)
          paramString1.setVisibility(0);
        paramString1.setText(paramString4);
      }
      a(paramq, locala, parama, localView, paramString5);
      paramString1 = (TextView)localView.findViewById(2131822923);
      paramString1.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramq.ylL, paramString3, paramString1.getTextSize()));
      localView.findViewById(2131822924).setVisibility(8);
      int i = BackwardSupportUtil.b.b(paramq.ylL, 120.0F);
      paramq = (CdnImageView)localView.findViewById(2131822922);
      if (paramq != null)
        paramq.am(paramString2, i, i);
      locala.fn(localView);
      paramq = locala.aMb();
      paramq.show();
      AppMethodBeat.o(27676);
    }
  }

  public static com.tencent.mm.ui.widget.a.c b(com.tencent.mm.ui.q paramq, String paramString, boolean paramBoolean, q.a parama)
  {
    AppMethodBeat.i(27680);
    paramq = b(paramq, paramString, paramBoolean, "", parama);
    AppMethodBeat.o(27680);
    return paramq;
  }

  public static com.tencent.mm.ui.widget.a.c b(com.tencent.mm.ui.q paramq, String paramString1, boolean paramBoolean, String paramString2, q.a parama)
  {
    AppMethodBeat.i(27681);
    if ((paramString1 == null) || (!e.ct(paramString1)))
    {
      ab.e("MicroMsg.MMConfirmDialog", "showDialogItem3 fail, img does not exist");
      AppMethodBeat.o(27681);
    }
    for (paramq = null; ; paramq = paramString1)
    {
      return paramq;
      com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(paramq.ylL);
      Object localObject = paramq.ylL.getIntent().getExtras().getString("Select_Conv_User", null);
      if (localObject != null)
      {
        localObject = bo.P(((String)localObject).split(","));
        a(paramq.ylL, locala, localObject);
      }
      locala.ra(true);
      locala.rc(false).rd(false);
      if (paramBoolean)
        locala.rb(true);
      if (!bo.isNullOrNil(paramString1))
      {
        localObject = com.tencent.mm.sdk.platformtools.d.aml(paramString1);
        int i = BackwardSupportUtil.ExifHelper.bJ(paramString1);
        if (localObject != null)
        {
          paramString1 = (String)localObject;
          if (i != 0)
            paramString1 = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject, i);
          locala.a(paramString1, true, 3);
          a(locala, paramString1);
          locala.ra(false);
        }
      }
      paramString1 = locala.aMb();
      a(paramq.ylL, paramString1, paramString2, null, parama, parama);
      paramString1.show();
      AppMethodBeat.o(27681);
    }
  }

  private static View d(Context paramContext, List<String> paramList)
  {
    AppMethodBeat.i(27671);
    paramContext = View.inflate(paramContext, 2130969191, null);
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((i > 8) || (paramContext == null))
          break label101;
        paramList = (ImageView)paramContext.findViewById(vkg[i]);
        if (str == null)
          break label101;
        paramList.setVisibility(0);
        com.tencent.mm.ui.e.a.a.b(paramList, str);
        i++;
      }
    }
    label101: 
    while (true)
    {
      break;
      AppMethodBeat.o(27671);
      return paramContext;
    }
  }

  private static com.tencent.mm.ui.base.o es(View paramView)
  {
    AppMethodBeat.i(27696);
    paramView = new com.tencent.mm.ui.base.o(paramView, -1, -1);
    AppMethodBeat.o(27696);
    return paramView;
  }

  private static void u(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(27700);
    if (paramView != null)
    {
      paramView = (EditText)paramView.findViewById(2131822921);
      if (paramView != null)
        if (!paramBoolean)
          break label43;
    }
    label43: for (int i = 0; ; i = 8)
    {
      paramView.setVisibility(i);
      AppMethodBeat.o(27700);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.g
 * JD-Core Version:    0.6.2
 */