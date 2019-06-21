package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class e extends a
{
  private static final Pattern gnw;
  public CharSequence gnx;
  public CharSequence gny;
  public l hpS;
  public String username;
  public String zpO;
  public boolean zpP;
  private e.b zpQ;
  private e.a zpR;

  static
  {
    AppMethodBeat.i(105284);
    gnw = Pattern.compile(",");
    AppMethodBeat.o(105284);
  }

  public e(int paramInt)
  {
    super(2, paramInt);
    AppMethodBeat.i(105282);
    this.zpQ = new e.b(this);
    this.zpR = new e.a(this);
    AppMethodBeat.o(105282);
  }

  public final void a(Context paramContext, a.a parama)
  {
    AppMethodBeat.i(105283);
    int i = 1;
    if (this.hpS != null)
    {
      j = i;
      if (this.ehM == null)
      {
        com.tencent.mm.kernel.g.RQ();
        this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoI(this.hpS.mDx);
        j = i;
        if (this.ehM == null)
        {
          com.tencent.mm.kernel.g.RQ();
          this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoN(this.hpS.mDx);
        }
      }
    }
    for (int j = i; this.ehM == null; j = 0)
    {
      ab.i("MicroMsg.ContactDataItem", "filling dataItem Occur Error Contact is null, position=%d", new Object[] { Integer.valueOf(this.position) });
      AppMethodBeat.o(105283);
      return;
    }
    this.username = this.ehM.field_username;
    this.zpO = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).ba(this.ehM.field_openImAppid, this.ehM.field_descWordingId);
    l locall;
    Object localObject1;
    String str1;
    CharSequence localCharSequence;
    int k;
    int m;
    boolean bool1;
    boolean bool2;
    boolean bool3;
    boolean bool4;
    boolean bool5;
    boolean bool6;
    Resources localResources;
    String str2;
    boolean bool7;
    boolean bool8;
    Object localObject2;
    Object localObject3;
    if (j != 0)
    {
      locall = this.hpS;
      localObject1 = this.ehM;
      str1 = null;
      localCharSequence = null;
      k = 0;
      m = 0;
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      bool5 = false;
      bool6 = false;
      localResources = paramContext.getResources();
      if (localObject1 == null)
        break label1180;
      str2 = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).a((ad)localObject1, ((ap)localObject1).field_username);
      bool7 = bool6;
      bool8 = bool3;
      j = m;
      i = k;
      parama = localCharSequence;
      localObject2 = str1;
      localObject3 = str2;
      switch (locall.mDw)
      {
      default:
        localObject3 = str2;
        localObject2 = str1;
        parama = localCharSequence;
        i = k;
        j = m;
        bool8 = bool3;
        bool7 = bool6;
      case 8:
      case 9:
      case 10:
      case 12:
      case 13:
      case 14:
      case 3:
      case 7:
      case 6:
      case 5:
      case 4:
      case 15:
      case 16:
      case 17:
      case 18:
      case 11:
      case 2:
      case 1:
      }
    }
    while (true)
    {
      label410: if (i != 0)
      {
        ab.d("MicroMsg.ContactDataItem", "highlight first line");
        this.gnx = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, (CharSequence)localObject3, com.tencent.mm.bz.a.al(paramContext, 2131427813));
        this.gnx = f.a(com.tencent.mm.plugin.fts.a.a.d.a(this.gnx, this.mDz, bool8, bool7)).mDR;
        label462: if (j == 0)
          break label1064;
        ab.d("MicroMsg.ContactDataItem", "highlight second line");
        this.gny = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, parama, com.tencent.mm.bz.a.al(paramContext, 2131427762));
        this.gny = f.a(com.tencent.mm.plugin.fts.a.a.d.a(this.gny, this.mDz, bool8, bool7)).mDR;
        if ((!bo.isNullOrNil((String)localObject2)) && (this.gny != null))
          this.gny = TextUtils.concat(new CharSequence[] { localObject2, this.gny });
        AppMethodBeat.o(105283);
        break;
        bool7 = true;
      }
      label514: label563: for (bool8 = true; ; bool8 = bool1)
      {
        i = 1;
        j = m;
        parama = localCharSequence;
        localObject2 = str1;
        localObject3 = str2;
        break label410;
        bool4 = true;
        bool2 = true;
        bool5 = bool4;
        parama = ((ap)localObject1).field_nickname;
        localObject2 = localResources.getString(2131302829);
        j = 1;
        bool7 = bool5;
        bool8 = bool2;
        i = k;
        localObject3 = str2;
        break label410;
        parama = ((ap)localObject1).dul;
        localObject2 = localResources.getString(2131302824);
        j = 1;
        bool7 = bool6;
        bool8 = bool3;
        i = k;
        localObject3 = str2;
        break label410;
        j = 1;
        localObject2 = ((ad)localObject1).Hq();
        parama = (a.a)localObject2;
        if (bo.isNullOrNil((String)localObject2))
          parama = ((ap)localObject1).field_username;
        localObject2 = localResources.getString(2131302833);
        bool7 = bool6;
        bool8 = bool3;
        i = k;
        localObject3 = str2;
        break label410;
        parama = locall.content;
        if (!bo.isNullOrNil(parama))
        {
          localObject3 = parama.split("​");
          i = localObject3.length;
          j = 0;
          label750: if (j < i)
          {
            localObject2 = localObject3[j];
            if (((String)localObject2).startsWith(this.query))
              parama = (a.a)localObject2;
          }
        }
        while (true)
        {
          localObject2 = localResources.getString(2131302828);
          j = 1;
          bool7 = bool6;
          bool8 = bool3;
          i = k;
          localObject3 = str2;
          break label410;
          j++;
          break label750;
          parama = locall.content;
          localObject2 = localResources.getString(2131302826);
          j = 1;
          bool7 = bool6;
          bool8 = bool3;
          i = k;
          localObject3 = str2;
          break label410;
          i = 1;
          localObject3 = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSMainDB().MX(((ap)localObject1).field_contactLabelIds);
          parama = new StringBuffer();
          for (localCharSequence : this.mDz.mEa)
          {
            localObject1 = ((List)localObject3).iterator();
            while (((Iterator)localObject1).hasNext())
            {
              str1 = (String)((Iterator)localObject1).next();
              if (com.tencent.mm.plugin.fts.a.d.Nb(str1).contains(localCharSequence))
              {
                parama.append(str1);
                parama.append(",");
              }
            }
          }
          parama.trimToSize();
          if (parama.length() == 0);
          for (parama = ""; ; parama = parama.substring(0, parama.length() - 1))
          {
            localObject2 = localResources.getString(2131302832);
            bool7 = bool6;
            bool8 = bool3;
            j = i;
            i = k;
            localObject3 = str2;
            break;
          }
          this.gnx = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, (CharSequence)localObject3, com.tencent.mm.bz.a.al(paramContext, 2131427813));
          break label462;
          this.gny = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, parama, com.tencent.mm.bz.a.al(paramContext, 2131427762));
          break label514;
          if (bo.isNullOrNil(this.cuP));
          for (parama = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).c(this.ehM); ; parama = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).getDisplayName(this.ehM.field_username, this.cuP))
          {
            this.gnx = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, parama, com.tencent.mm.bz.a.al(paramContext, 2131427813));
            AppMethodBeat.o(105283);
            break;
          }
        }
        bool7 = false;
        break label563;
        bool7 = false;
      }
      label1064: localObject3 = null;
      label1180: bool7 = bool6;
      bool8 = bool3;
      j = m;
      i = k;
      parama = localCharSequence;
      localObject2 = str1;
    }
  }

  public a.b aou()
  {
    return this.zpQ;
  }

  public a.a clJ()
  {
    return this.zpR;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.e
 * JD-Core Version:    0.6.2
 */