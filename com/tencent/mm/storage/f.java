package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.y;

public final class f
  implements com.tencent.mm.cd.a.a<String>
{
  public long ewQ;
  private String field_alias;
  public String field_conRemark;
  public int field_deleteFlag;
  public String field_descWording;
  public String field_descWordingId;
  public String field_descWordingQuanpin;
  public byte[] field_lvbuff;
  public String field_nickname;
  public String field_openImAppid;
  public String field_remarkDesc;
  public int field_showHead;
  public String field_signature;
  public String field_username;
  public int field_verifyFlag;
  public int field_weiboFlag;
  public CharSequence xHQ;

  private void drv()
  {
    AppMethodBeat.i(136950);
    if (this.field_lvbuff == null)
      AppMethodBeat.o(136950);
    while (true)
    {
      return;
      try
      {
        if (this.field_lvbuff != null)
        {
          i = this.field_lvbuff.length;
          if (i != 0);
        }
        else
        {
          AppMethodBeat.o(136950);
          continue;
        }
        y localy = new com/tencent/mm/sdk/platformtools/y;
        localy.<init>();
        int i = localy.bX(this.field_lvbuff);
        if (i != 0)
        {
          AppMethodBeat.o(136950);
        }
        else
        {
          localy.LW(4);
          localy.LW(4);
          localy.doe();
          localy.LW(8);
          localy.LW(4);
          localy.doe();
          localy.doe();
          localy.LW(4);
          localy.LW(4);
          localy.doe();
          localy.doe();
          localy.LW(4);
          localy.LW(4);
          this.field_signature = localy.getString();
          localy.doe();
          localy.doe();
          localy.doe();
          localy.LW(4);
          localy.LW(4);
          localy.doe();
          localy.LW(4);
          localy.doe();
          localy.doe();
          localy.LW(4);
          localy.LW(4);
          if (!localy.dof())
            this.field_remarkDesc = localy.getString();
          this.field_lvbuff = null;
          AppMethodBeat.o(136950);
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AddressUIContact", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(136950);
      }
    }
  }

  public final String Oj()
  {
    AppMethodBeat.i(136949);
    Object localObject;
    if ((this.field_conRemark != null) && (!this.field_conRemark.trim().equals("")))
    {
      localObject = this.field_conRemark;
      AppMethodBeat.o(136949);
    }
    while (true)
    {
      return localObject;
      localObject = com.tencent.mm.n.a.kN(this.field_username);
      if (localObject != null)
      {
        AppMethodBeat.o(136949);
      }
      else if ((this.field_nickname == null) || (this.field_nickname.length() <= 0))
      {
        localObject = this.field_alias;
        if (!bo.isNullOrNil((String)localObject))
        {
          AppMethodBeat.o(136949);
        }
        else
        {
          String str = this.field_username;
          if (str == null)
            localObject = null;
          while (true)
          {
            if ((localObject == null) || (((String)localObject).length() == 0))
              break label217;
            AppMethodBeat.o(136949);
            break;
            if (str.toLowerCase().endsWith("@t.qq.com"))
            {
              localObject = "@" + str.replace("@t.qq.com", "");
            }
            else
            {
              localObject = str;
              if (str.toLowerCase().endsWith("@qqim"))
              {
                localObject = str.replace("@qqim", "");
                long l = Long.valueOf((String)localObject).longValue();
                if (l < 0L)
                  localObject = new p(l).toString();
              }
            }
          }
          label217: localObject = this.field_username;
          AppMethodBeat.o(136949);
        }
      }
      else
      {
        localObject = this.field_nickname;
        AppMethodBeat.o(136949);
      }
    }
  }

  public final void ag(int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    default:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    }
    while (true)
    {
      return;
      this.field_verifyFlag = ((int)paramLong);
      continue;
      this.field_showHead = ((int)paramLong);
      continue;
      this.field_weiboFlag = ((int)paramLong);
      continue;
      this.ewQ = paramLong;
      continue;
      this.field_deleteFlag = ((int)paramLong);
    }
  }

  public final void bK(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 10:
    case 11:
    case 12:
    case 13:
    }
    while (true)
    {
      return;
      this.field_username = paramString;
      continue;
      this.field_nickname = paramString;
      continue;
      this.field_alias = paramString;
      continue;
      this.field_conRemark = paramString;
      continue;
      this.field_descWordingId = paramString;
      continue;
      this.field_openImAppid = paramString;
      continue;
      this.field_descWording = paramString;
      continue;
      this.field_descWordingQuanpin = paramString;
    }
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(136948);
    this.field_username = paramCursor.getString(0);
    this.field_nickname = paramCursor.getString(1);
    this.field_alias = paramCursor.getString(2);
    this.field_conRemark = paramCursor.getString(3);
    this.field_verifyFlag = paramCursor.getInt(4);
    this.field_showHead = paramCursor.getInt(5);
    this.field_weiboFlag = paramCursor.getInt(6);
    this.ewQ = paramCursor.getLong(7);
    this.field_deleteFlag = paramCursor.getInt(8);
    this.field_lvbuff = paramCursor.getBlob(9);
    this.field_descWordingId = paramCursor.getString(10);
    this.field_openImAppid = paramCursor.getString(11);
    if (paramCursor.getColumnCount() >= 14)
    {
      this.field_descWording = paramCursor.getString(12);
      this.field_descWordingQuanpin = paramCursor.getString(13);
    }
    drv();
    AppMethodBeat.o(136948);
  }

  public final void drw()
  {
    AppMethodBeat.i(136951);
    drv();
    AppMethodBeat.o(136951);
  }

  public final void q(int paramInt, byte[] paramArrayOfByte)
  {
    if (paramInt == 9)
      this.field_lvbuff = paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.f
 * JD-Core Version:    0.6.2
 */