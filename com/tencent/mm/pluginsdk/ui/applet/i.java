package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class i
{
  private Context context;
  f ehK;
  private View gwR;
  private View jNV;
  public View.OnClickListener pLd;
  ContactListExpandPreference.a rPU;
  String username;
  private j.a vkA;
  private String vkp;
  private HashMap<String, Preference> vkq;
  private boolean vkr;
  private boolean vks;
  public j vkt;
  k.b vku;
  private View.OnClickListener vkv;
  private View.OnClickListener vkw;
  private View.OnClickListener vkx;
  private k.b vky;
  private k.a vkz;

  public i(Context paramContext)
  {
    AppMethodBeat.i(79735);
    this.vkq = new HashMap();
    this.vkr = false;
    if (this.vkr)
      bool = true;
    this.vks = bool;
    this.vku = null;
    this.pLd = null;
    this.rPU = null;
    this.vkx = new i.1(this);
    this.vky = new i.2(this);
    this.vkz = new i.3(this);
    this.vkA = new i.4(this);
    this.context = paramContext;
    this.vkt = new j(this.context);
    this.vkt.vkD = this.vkA;
    AppMethodBeat.o(79735);
  }

  private void KR(int paramInt)
  {
    AppMethodBeat.i(79740);
    int i = 0;
    if (this.gwR != null)
      i = 1;
    Object localObject1;
    if (this.jNV != null)
      if (this.vkr)
      {
        localObject1 = this.vkt;
        if (((j)localObject1).vkI <= ((j)localObject1).vkQ)
          break label428;
        j = 1;
        if (j == 0)
          break label730;
      }
    label147: label160: label186: label451: label462: label727: label730: for (int j = 1; ; j = 0)
    {
      int k = paramInt;
      if (i != 0)
      {
        localObject1 = new ContactListCustomPreference(this.context);
        ((ContactListCustomPreference)localObject1).setKey(KS(-1));
        ((ContactListCustomPreference)localObject1).setCustomView(this.gwR);
        ((ContactListCustomPreference)localObject1).background = 2130838396;
        ((ContactListCustomPreference)localObject1).pLd = this.vkv;
        this.ehK.a((Preference)localObject1, paramInt);
        this.vkq.put(((Preference)localObject1).mKey, localObject1);
        k = paramInt + 1;
      }
      View.OnClickListener localOnClickListener;
      boolean bool1;
      boolean bool2;
      if (this.vku != null)
      {
        localObject1 = this.vku;
        if (this.pLd == null)
          break label442;
        localOnClickListener = this.pLd;
        if ((this.vkt.eih == null) || (!this.vkt.eih.JR()))
          break label451;
        bool1 = true;
        bool2 = this.vkt.djB();
        if (!this.vkt.mgP)
          break label727;
        bool1 = this.vkt.vkF;
      }
      while (true)
      {
        int m = this.vkt.vkJ;
        if ((!bool2) || (bool1));
        int n;
        Object localObject2;
        Context localContext;
        for (paramInt = 2; ; paramInt = 1)
        {
          n = 0;
          localObject2 = this.vkt;
          localContext = this.context;
          if (localContext != null)
            break label462;
          i = 0;
          i1 = 0;
          while ((i1 < this.vkt.getCount()) && (i1 < m + paramInt))
          {
            localObject2 = new ContactListExpandPreference(this.context, 1);
            ((ContactListExpandPreference)localObject2).setKey(KS(n));
            localObject3 = ((ContactListExpandPreference)localObject2).vle;
            ((k)localObject3).vkt = this.vkt;
            ((k)localObject3).row = n;
            ((k)localObject3).index = i1;
            ((ContactListExpandPreference)localObject2).vle.vlf = i;
            ((ContactListExpandPreference)localObject2).vle.eic = bool1;
            ((ContactListExpandPreference)localObject2).vle.pLd = localOnClickListener;
            ((ContactListExpandPreference)localObject2).vle.vkz = this.vkz;
            ((ContactListExpandPreference)localObject2).vle.vlg = ((k.b)localObject1);
            this.ehK.a((Preference)localObject2, k + n);
            this.vkq.put(((Preference)localObject2).mKey, localObject2);
            i1 += i;
            n++;
          }
          j = 0;
          break;
          localObject1 = this.vky;
          break label147;
          localOnClickListener = this.vkx;
          break label160;
          bool1 = false;
          break label186;
        }
        Object localObject3 = ((WindowManager)localContext.getSystemService("window")).getDefaultDisplay();
        int i1 = ((Display)localObject3).getWidth();
        i = ((Display)localObject3).getHeight();
        float f1;
        if ((i1 / (localContext.getResources().getDimension(2131427806) + localContext.getResources().getDimension(2131427796) * 2.0F) >= 5.0F) && (i > i1))
        {
          ((j)localObject2).vkW = true;
          f1 = localContext.getResources().getDimension(2131427796);
          if (!((j)localObject2).vkW)
            break label635;
        }
        label635: for (float f2 = localContext.getResources().getDimension(2131427806); ; f2 = localContext.getResources().getDimension(2131427804))
        {
          i1 /= (int)(f2 + 2.0F * f1);
          ab.i("MicroMsg.ContactsListArchAdapter", "[getWrapColNum] :%s", new Object[] { Integer.valueOf(i1) });
          j.vkC = i1;
          i = i1;
          if (i1 != 4)
            break;
          j.MAX_COUNT = 43;
          i = i1;
          break;
          ((j)localObject2).vkW = false;
          break label537;
        }
        if (j != 0)
        {
          localObject1 = new ContactListCustomPreference(this.context);
          ((ContactListCustomPreference)localObject1).setKey(KS(-2));
          ((ContactListCustomPreference)localObject1).setCustomView(this.jNV);
          ((ContactListCustomPreference)localObject1).pLd = this.vkw;
          this.ehK.a((Preference)localObject1, k + n);
          this.vkq.put(((Preference)localObject1).mKey, localObject1);
        }
        AppMethodBeat.o(79740);
        return;
      }
    }
  }

  private static String KS(int paramInt)
  {
    AppMethodBeat.i(79742);
    if (paramInt >= 0)
    {
      str = "pref_contact_list_row_".concat(String.valueOf(paramInt));
      AppMethodBeat.o(79742);
      return str;
    }
    String str = "unkown";
    if (paramInt == -1)
      str = "header";
    while (true)
    {
      str = "pref_contact_list_row_".concat(String.valueOf(str));
      AppMethodBeat.o(79742);
      break;
      if (paramInt == -2)
        str = "footer";
    }
  }

  private void Qb(String paramString)
  {
    AppMethodBeat.i(79738);
    this.vkt.setUsername(paramString);
    this.vkt.vkP = this.vks;
    this.vkt.Kh();
    aPw();
    AppMethodBeat.o(79738);
  }

  private void removeAll()
  {
    AppMethodBeat.i(79741);
    Iterator localIterator = this.vkq.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.ehK.aqP(str);
    }
    this.vkq.clear();
    AppMethodBeat.o(79741);
  }

  public final void a(f paramf, String paramString)
  {
    AppMethodBeat.i(79739);
    if ((paramf == null) || (paramString == null))
      AppMethodBeat.o(79739);
    while (true)
    {
      return;
      this.ehK = paramf;
      this.vkp = paramString;
      paramf.ce(paramString, true);
      AppMethodBeat.o(79739);
    }
  }

  public final void aPw()
  {
    AppMethodBeat.i(79743);
    if ((this.ehK == null) || (this.vkp == null))
      AppMethodBeat.o(79743);
    while (true)
    {
      return;
      removeAll();
      KR(this.ehK.indexOf(this.vkp));
      AppMethodBeat.o(79743);
    }
  }

  public final void ag(ArrayList<ad> paramArrayList)
  {
    AppMethodBeat.i(79737);
    Object localObject = paramArrayList;
    if (paramArrayList == null)
      localObject = new ArrayList(0);
    this.vkt.ah((ArrayList)localObject);
    Qb(null);
    AppMethodBeat.o(79737);
  }

  public final void djz()
  {
    boolean bool = false;
    this.vkr = false;
    if (this.vkr)
      bool = true;
    this.vks = bool;
  }

  public final void u(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(79736);
    this.username = paramString;
    Object localObject = paramList;
    if (paramList == null)
      localObject = new ArrayList(0);
    this.vkt.jdMethod_do((List)localObject);
    Qb(paramString);
    AppMethodBeat.o(79736);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.i
 * JD-Core Version:    0.6.2
 */