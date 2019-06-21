package com.tencent.mm.plugin.fav.ui.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ad.a;
import com.tencent.mm.model.ad.b;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.ui.b.a;
import com.tencent.mm.plugin.fts.ui.b.c;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aaw;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a extends com.tencent.mm.plugin.fts.a.d.a.a
{
  private static final ak handler;
  private static final String mnp;
  private static final Pattern mnq;
  public String gEl;
  public l hpS;
  public CharSequence mnr;
  public CharSequence mns;
  public CharSequence mnt;
  public String mnu;
  public int mnv;
  private a.b mnw;
  a.a mnx;

  static
  {
    AppMethodBeat.i(74498);
    mnp = ah.getContext().getString(2131300127);
    mnq = Pattern.compile("['\r\n' | '\n']+");
    handler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(74498);
  }

  public a(int paramInt)
  {
    super(7, paramInt);
    AppMethodBeat.i(74493);
    this.mnw = new a.b(this);
    this.mnx = new a.a(this);
    AppMethodBeat.o(74493);
  }

  public static void a(TextView paramTextView1, TextView paramTextView2, CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    AppMethodBeat.i(74492);
    if (m.a(paramCharSequence1, paramTextView1))
      if (m.a(paramCharSequence2, paramTextView2))
      {
        paramTextView1.setMaxLines(1);
        paramTextView2.setMaxLines(1);
        AppMethodBeat.o(74492);
      }
    while (true)
    {
      return;
      paramTextView1.setMaxLines(2);
      AppMethodBeat.o(74492);
      continue;
      if (m.a(paramCharSequence2, paramTextView2))
        paramTextView2.setMaxLines(2);
      AppMethodBeat.o(74492);
    }
  }

  private static String b(Context paramContext, ad paramad)
  {
    AppMethodBeat.i(74496);
    String str1 = paramad.field_conRemark;
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = paramad.field_nickname;
    paramad = str2;
    if (bo.isNullOrNil(str2))
      paramad = paramContext.getString(2131300105);
    AppMethodBeat.o(74496);
    return paramad;
  }

  private static String b(ad paramad, boolean paramBoolean)
  {
    AppMethodBeat.i(74495);
    if ((paramBoolean) && (!bo.isNullOrNil(paramad.field_conRemark)));
    for (String str1 = paramad.field_conRemark; ; str1 = paramad.field_nickname)
    {
      String str2 = str1;
      if (bo.isNullOrNil(str1))
        str2 = paramad.field_username;
      AppMethodBeat.o(74495);
      return str2;
    }
  }

  private String bR(List<String> paramList)
  {
    AppMethodBeat.i(74497);
    StringBuffer localStringBuffer = new StringBuffer();
    for (String str1 : this.mDz.mEa)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        if (com.tencent.mm.plugin.fts.a.d.Nb(str2).contains(str1))
        {
          localStringBuffer.append(str2);
          localStringBuffer.append(",");
        }
      }
    }
    localStringBuffer.trimToSize();
    if (localStringBuffer.length() == 0)
    {
      paramList = "";
      AppMethodBeat.o(74497);
    }
    while (true)
    {
      return paramList;
      paramList = localStringBuffer.substring(0, localStringBuffer.length() - 1);
      AppMethodBeat.o(74497);
    }
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a.b Ps()
  {
    return this.mnw;
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(74494);
    long l = this.hpS.mEB;
    parama = new gh();
    parama.cAH.type = 9;
    parama.cAH.cvv = l;
    com.tencent.mm.sdk.b.a.xxA.m(parama);
    aaw localaaw = parama.cAI.cAT;
    l = this.hpS.mEB;
    parama = new gh();
    parama.cAH.type = 11;
    parama.cAH.cvv = l;
    parama.cAH.handler = handler;
    com.tencent.mm.sdk.b.a.xxA.m(parama);
    this.mnu = bo.bc(parama.cAI.thumbPath, "");
    this.gEl = bo.bc(parama.cAI.thumbUrl, "");
    Object localObject = this.hpS;
    float f = b.a.mHq * 2;
    paramArrayOfObject = localaaw.cKb;
    parama = "";
    label254: int i;
    switch (localaaw.type)
    {
    case 5:
    case 8:
    case 9:
    case 12:
    case 13:
    case 15:
    default:
      parama = localaaw.title;
      switch (((l)localObject).mDw)
      {
      default:
        label296: this.mnr = parama;
        paramArrayOfObject = this.hpS;
        localObject = localaaw.cKb;
        parama = "";
        switch (localaaw.type)
        {
        case 3:
        case 4:
        case 8:
        case 9:
        case 13:
        default:
          parama = "";
          label395: switch (paramArrayOfObject.mDw)
          {
          default:
            paramArrayOfObject = "";
            i = -1;
            label446: if ((i != -1) && (!bo.isNullOrNil(parama)))
              paramArrayOfObject = TextUtils.concat(new CharSequence[] { paramContext.getResources().getString(i), paramArrayOfObject });
            break;
          case 23:
          case 7:
          case 8:
          case 6:
          }
          break;
        case 5:
        case 7:
        case 12:
        case 15:
        case 2:
        case 6:
        case 10:
        case 11:
        case 14:
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
      break;
    case 1:
    case 2:
    case 6:
    case 4:
    case 3:
    case 10:
    case 11:
    case 14:
    case 7:
    case 16:
    }
    label593: label1490: 
    while (true)
    {
      this.mns = paramArrayOfObject;
      l locall = this.hpS;
      paramArrayOfObject = localaaw.cEV;
      parama = localaaw.wif;
      if (bo.isNullOrNil(paramArrayOfObject))
      {
        localObject = null;
        paramArrayOfObject = parama;
        parama = (com.tencent.mm.plugin.fts.a.d.a.a.a)localObject;
      }
      label1370: label1627: label1636: label1774: 
      while (true)
      {
        if (bo.isNullOrNil(paramArrayOfObject));
        ad localad;
        boolean bool3;
        for (paramContext = new SpannableString(""); ; paramContext = TextUtils.concat(new CharSequence[] { paramContext.getResources().getString(2131302816), parama }))
        {
          this.mnt = paramContext;
          switch (localaaw.type)
          {
          case 7:
          default:
            i = 2131231335;
            this.mnv = i;
            AppMethodBeat.o(74494);
            return;
            parama = mnq.matcher(localaaw.desc).replaceAll(" ");
            break label254;
            parama = paramContext.getResources().getString(2131302843);
            break label254;
            parama = localaaw.cKb.why;
            if ((mnp.equals(parama.cIK)) || (bo.isNullOrNil(parama.cIK)))
            {
              parama = parama.label;
              break label254;
            }
            parama = parama.cIK;
            break label254;
            parama = paramContext.getResources().getString(2131302847);
            break label254;
            parama = paramContext.getResources().getString(2131302848);
            break label254;
            if (paramArrayOfObject.whC == null)
              break label254;
            parama = paramArrayOfObject.whC.title;
            break label254;
            parama = new StringBuffer();
            Iterator localIterator = paramArrayOfObject.wiv.iterator();
            while (localIterator.hasNext())
            {
              paramArrayOfObject = b.a((aar)localIterator.next());
              if (!bo.isNullOrNil(paramArrayOfObject))
              {
                parama.append(paramArrayOfObject);
                parama.append(" ");
              }
            }
            paramArrayOfObject = mnq.matcher(parama.toString()).replaceAll(" ");
            parama = paramArrayOfObject;
            if (!bo.isNullOrNil(paramArrayOfObject))
              break label254;
            parama = paramContext.getResources().getString(2131302845);
            break label254;
            paramArrayOfObject = localaaw.title;
            parama = paramArrayOfObject;
            if (bo.isNullOrNil(localaaw.desc))
              break label254;
            parama = paramArrayOfObject + "-" + localaaw.desc;
            break label254;
            parama = paramContext.getResources().getString(2131302846);
            break label254;
            parama = f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, this.mDz, f, b.c.mHz)).mDR;
            break label296;
            if (bo.isNullOrNil(localaaw.appId))
              break label395;
            parama = ad.a.fls.t(paramContext, localaaw.appId);
            break label395;
            parama = localaaw.title;
            break label395;
            parama = localaaw.cKb.why;
            if ((mnp.equals(parama.cIK)) || (bo.isNullOrNil(parama.cIK)))
            {
              parama = parama.label;
              break label395;
            }
            parama = parama.cIK;
            break label395;
            if (((abf)localObject).whC == null)
              break label395;
            parama = ((abf)localObject).whC.desc;
            break label395;
            parama = "";
            break label395;
            i = 2131302842;
            paramArrayOfObject = f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, this.mDz)).mDR;
            break label446;
            i = 2131302844;
            parama = bR(localaaw.wig);
            paramArrayOfObject = f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, this.mDz)).mDR;
            break label446;
            paramArrayOfObject = f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, this.mDz)).mDR;
            i = -1;
            break label446;
            localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramArrayOfObject);
            localad.setUsername(paramArrayOfObject);
            localIterator = null;
            localObject = localIterator;
            if (t.kH(paramArrayOfObject))
            {
              localObject = localIterator;
              if (!bo.isNullOrNil(parama))
              {
                localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parama);
                ((ad)localObject).setUsername(parama);
              }
            }
            switch (locall.mDw)
            {
            case 15:
            case 19:
            default:
              bool1 = false;
              bool2 = false;
              i = 0;
              if (localObject == null)
                break label1636;
              parama = b((ad)localObject, true) + "-" + b(paramContext, localad);
              bool3 = bool1;
              bool1 = bool2;
              bool2 = bool3;
              parama = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, parama, com.tencent.mm.bz.a.al(paramContext, 2131427762));
              if (i == 0)
                break label1774;
              parama = f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, this.mDz, bool1, bool2)).mDR;
            case 14:
            case 22:
            case 11:
            case 18:
            case 13:
            case 21:
            case 10:
            case 17:
            case 9:
            case 16:
            case 20:
            case 12:
            }
            break;
          case 8:
          case 5:
          case 3:
          case 4:
          case 6:
          }
        }
        boolean bool1 = true;
        label1401: for (boolean bool2 = true; ; bool2 = false)
        {
          if (localObject != null)
          {
            parama = b((ad)localObject, false) + "-" + b(paramContext, localad);
            bool3 = bool2;
            i = 1;
            bool2 = bool1;
            bool1 = bool3;
            break label1333;
          }
          parama = b(localad, false);
          bool3 = bool2;
          i = 1;
          bool2 = bool1;
          bool1 = bool3;
          break label1333;
          bool2 = true;
          for (bool1 = true; ; bool1 = false)
          {
            if (localObject != null)
              parama = b((ad)localObject, true) + "-" + b(paramContext, localad);
            while (true)
            {
              paramArrayOfObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(localaaw.csl);
              parama = parama + "-" + b(paramArrayOfObject, true);
              i = 1;
              break;
              if (t.kH(localad.field_username))
                parama = b(paramContext, localad);
              else
                parama = b(localad, true);
            }
            bool1 = true;
            for (bool2 = true; ; bool2 = false)
            {
              i = 1;
              break label1281;
              if (t.kH(localad.field_username))
              {
                parama = b(paramContext, localad);
                bool3 = bool1;
                bool1 = bool2;
                bool2 = bool3;
                break label1333;
              }
              parama = b(localad, true);
              bool3 = bool2;
              bool2 = bool1;
              bool1 = bool3;
              break label1333;
              if ((localaaw.cKb.wiv == null) || (localaaw.cKb.wiv.size() <= 0))
                break;
              i = com.tencent.mm.pluginsdk.d.ail(((aar)localaaw.cKb.wiv.get(0)).wgo);
              break label593;
              i = 2131230820;
              break label593;
              i = 2131230819;
              break label593;
              i = 2131230817;
              break label593;
              i = 2131230798;
              break label593;
              break label1370;
              bool1 = false;
              break label1401;
              bool2 = false;
              break label1490;
              bool1 = false;
              break label1627;
              bool1 = false;
            }
            bool2 = false;
          }
          bool1 = false;
        }
      }
    }
  }

  public final int aAq()
  {
    return this.hpS.mEK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.b.a
 * JD-Core Version:    0.6.2
 */