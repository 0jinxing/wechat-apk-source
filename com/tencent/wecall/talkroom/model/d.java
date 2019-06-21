package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.a.a.a;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.aw;
import com.tencent.pb.common.c.c;
import com.tencent.pb.common.c.g;

public final class d
{
  a.av AJb;
  private a.aw AJc;
  private String rAH;

  public d(a.av paramav)
  {
    AppMethodBeat.i(127811);
    a(paramav);
    AppMethodBeat.o(127811);
  }

  public d(a.av paramav, a.aw paramaw)
  {
    AppMethodBeat.i(127812);
    a(paramav);
    if (paramaw == null)
    {
      c.w("tagorewang:TalkRoomMember", new Object[] { "set null profile" });
      AppMethodBeat.o(127812);
    }
    while (true)
    {
      return;
      this.AJc = paramaw;
      AppMethodBeat.o(127812);
    }
  }

  public final void a(a.av paramav)
  {
    AppMethodBeat.i(127813);
    if (paramav == null)
    {
      c.w("tagorewang:TalkRoomMember", new Object[] { "set null info" });
      AppMethodBeat.o(127813);
    }
    while (true)
    {
      return;
      this.AJb = paramav;
      AppMethodBeat.o(127813);
    }
  }

  public final String dTi()
  {
    if (this.AJb != null);
    for (String str = this.AJb.Aop; ; str = "")
      return str;
  }

  public final int dTj()
  {
    if (this.AJb == null);
    for (int i = -1; ; i = this.AJb.kyZ)
      return i;
  }

  public final boolean dTk()
  {
    AppMethodBeat.i(127818);
    boolean bool = g.equals(a.dPM(), dTi());
    AppMethodBeat.o(127818);
    return bool;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(127816);
    boolean bool;
    if ((paramObject == null) || (!(paramObject instanceof d)))
    {
      bool = false;
      AppMethodBeat.o(127816);
    }
    while (true)
    {
      return bool;
      bool = g.equals(dTi(), ((d)paramObject).dTi());
      AppMethodBeat.o(127816);
    }
  }

  public final String getDisplayName()
  {
    AppMethodBeat.i(127814);
    try
    {
      Object localObject = this.rAH;
      if ((localObject == null) || (((String)localObject).trim().length() == 0))
        AppMethodBeat.o(127814);
      while (true)
      {
        return localObject;
        char[] arrayOfChar = ((String)localObject).trim().toCharArray();
        int i = 0;
        int j = 0;
        if (i < arrayOfChar.length)
        {
          if (arrayOfChar[i] >= '¡')
            j += 2;
          while (true)
          {
            i++;
            break;
            j++;
          }
        }
        if (j <= 10)
        {
          AppMethodBeat.o(127814);
        }
        else
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          j = 0;
          i = 0;
          if (i < arrayOfChar.length)
          {
            if (arrayOfChar[i] >= '¡')
              j += 2;
            while (true)
            {
              if (j + 1 > 10)
                break label149;
              ((StringBuilder)localObject).append(arrayOfChar[i]);
              i++;
              break;
              j++;
            }
          }
          label149: ((StringBuilder)localObject).append('…');
          localObject = ((StringBuilder)localObject).toString();
          AppMethodBeat.o(127814);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        c.w("tagorewang:TalkRoomMember", new Object[] { "getDisplayName err: ", localException });
        String str = this.rAH;
        AppMethodBeat.o(127814);
      }
    }
  }

  public final int getState()
  {
    if (this.AJb == null);
    for (int i = 0; ; i = this.AJb.status)
      return i;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(127817);
    String str = dTi();
    int i;
    if (str == null)
    {
      i = 0;
      AppMethodBeat.o(127817);
    }
    while (true)
    {
      return i;
      i = str.hashCode();
      AppMethodBeat.o(127817);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(127815);
    int i = 0;
    if (this.AJb != null)
      i = this.AJb.vzt;
    while ((this.AJb == null) || (this.AJc == null))
    {
      localObject1 = "invlaid TalkRoomMember which uuid is ".concat(String.valueOf(i));
      AppMethodBeat.o(127815);
      return localObject1;
      if (this.AJc != null)
        i = this.AJc.vzt;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject2 = this.AJb;
    label93: a.aw localaw;
    if (localObject2 == null)
    {
      localObject1 = "null";
      localObject2 = localStringBuilder.append((String)localObject1).append(" ");
      localaw = this.AJc;
      if (localaw != null)
        break label252;
    }
    for (Object localObject1 = "null"; ; localObject1 = ((StringBuilder)localObject1).toString())
    {
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = localStringBuilder.toString();
      AppMethodBeat.o(127815);
      break;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("VoiceGroupMem");
      ((StringBuilder)localObject1).append(" uuid:").append(((a.av)localObject2).vzt);
      ((StringBuilder)localObject1).append(" openClientId:").append(((a.av)localObject2).Apl);
      ((StringBuilder)localObject1).append(" invite uuid: ").append(((a.av)localObject2).Aph);
      ((StringBuilder)localObject1).append(" member id:").append(((a.av)localObject2).kyZ);
      ((StringBuilder)localObject1).append(" status: ").append(((a.av)localObject2).status);
      ((StringBuilder)localObject1).append(" reason: ").append(((a.av)localObject2).boZ);
      localObject1 = ((StringBuilder)localObject1).toString();
      break label93;
      label252: localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("VoiceGroupUsrProfile");
      ((StringBuilder)localObject1).append(" uuid: ").append(localaw.vzt);
      ((StringBuilder)localObject1).append(" user name: ").append(localaw.username);
      ((StringBuilder)localObject1).append(" head url: ").append(localaw.pHn);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.d
 * JD-Core Version:    0.6.2
 */