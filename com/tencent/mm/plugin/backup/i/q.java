package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class q extends com.tencent.mm.bt.a
{
  public String jBG;
  public String jCa;
  public String jCb;
  public String jCc;
  public String jCd;
  public long jCe;
  public long jCf;
  public String jCg;
  public String jCh;
  public com.tencent.mm.bt.b jCi;
  public com.tencent.mm.bt.b jCj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18064);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jCa == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: WeChatVersion");
        AppMethodBeat.o(18064);
        throw paramArrayOfObject;
      }
      if (this.jCb == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: WeChatUserID");
        AppMethodBeat.o(18064);
        throw paramArrayOfObject;
      }
      if (this.jCc == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: WeChatNickName");
        AppMethodBeat.o(18064);
        throw paramArrayOfObject;
      }
      if (this.jCd == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: WeChatInstallDir");
        AppMethodBeat.o(18064);
        throw paramArrayOfObject;
      }
      if (this.jCg == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Manufacturer");
        AppMethodBeat.o(18064);
        throw paramArrayOfObject;
      }
      if (this.jBG == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Model");
        AppMethodBeat.o(18064);
        throw paramArrayOfObject;
      }
      if (this.jCh == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Version");
        AppMethodBeat.o(18064);
        throw paramArrayOfObject;
      }
      if (this.jCa != null)
        paramArrayOfObject.e(1, this.jCa);
      if (this.jCb != null)
        paramArrayOfObject.e(2, this.jCb);
      if (this.jCc != null)
        paramArrayOfObject.e(3, this.jCc);
      if (this.jCd != null)
        paramArrayOfObject.e(4, this.jCd);
      paramArrayOfObject.ai(5, this.jCe);
      paramArrayOfObject.ai(6, this.jCf);
      if (this.jCg != null)
        paramArrayOfObject.e(7, this.jCg);
      if (this.jBG != null)
        paramArrayOfObject.e(8, this.jBG);
      if (this.jCh != null)
        paramArrayOfObject.e(9, this.jCh);
      if (this.jCi != null)
        paramArrayOfObject.c(10, this.jCi);
      if (this.jCj != null)
        paramArrayOfObject.c(11, this.jCj);
      AppMethodBeat.o(18064);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jCa == null)
        break label1206;
    label1206: for (paramInt = e.a.a.b.b.a.f(1, this.jCa) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jCb != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jCb);
      paramInt = i;
      if (this.jCc != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.jCc);
      i = paramInt;
      if (this.jCd != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.jCd);
      paramInt = i + e.a.a.b.b.a.o(5, this.jCe) + e.a.a.b.b.a.o(6, this.jCf);
      i = paramInt;
      if (this.jCg != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.jCg);
      paramInt = i;
      if (this.jBG != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.jBG);
      i = paramInt;
      if (this.jCh != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.jCh);
      paramInt = i;
      if (this.jCi != null)
        paramInt = i + e.a.a.b.b.a.b(10, this.jCi);
      i = paramInt;
      if (this.jCj != null)
        i = paramInt + e.a.a.b.b.a.b(11, this.jCj);
      AppMethodBeat.o(18064);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jCa == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: WeChatVersion");
          AppMethodBeat.o(18064);
          throw paramArrayOfObject;
        }
        if (this.jCb == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: WeChatUserID");
          AppMethodBeat.o(18064);
          throw paramArrayOfObject;
        }
        if (this.jCc == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: WeChatNickName");
          AppMethodBeat.o(18064);
          throw paramArrayOfObject;
        }
        if (this.jCd == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: WeChatInstallDir");
          AppMethodBeat.o(18064);
          throw paramArrayOfObject;
        }
        if (this.jCg == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Manufacturer");
          AppMethodBeat.o(18064);
          throw paramArrayOfObject;
        }
        if (this.jBG == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Model");
          AppMethodBeat.o(18064);
          throw paramArrayOfObject;
        }
        if (this.jCh == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Version");
          AppMethodBeat.o(18064);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18064);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        q localq = (q)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18064);
          break;
        case 1:
          localq.jCa = locala.BTU.readString();
          AppMethodBeat.o(18064);
          paramInt = i;
          break;
        case 2:
          localq.jCb = locala.BTU.readString();
          AppMethodBeat.o(18064);
          paramInt = i;
          break;
        case 3:
          localq.jCc = locala.BTU.readString();
          AppMethodBeat.o(18064);
          paramInt = i;
          break;
        case 4:
          localq.jCd = locala.BTU.readString();
          AppMethodBeat.o(18064);
          paramInt = i;
          break;
        case 5:
          localq.jCe = locala.BTU.ve();
          AppMethodBeat.o(18064);
          paramInt = i;
          break;
        case 6:
          localq.jCf = locala.BTU.ve();
          AppMethodBeat.o(18064);
          paramInt = i;
          break;
        case 7:
          localq.jCg = locala.BTU.readString();
          AppMethodBeat.o(18064);
          paramInt = i;
          break;
        case 8:
          localq.jBG = locala.BTU.readString();
          AppMethodBeat.o(18064);
          paramInt = i;
          break;
        case 9:
          localq.jCh = locala.BTU.readString();
          AppMethodBeat.o(18064);
          paramInt = i;
          break;
        case 10:
          localq.jCi = locala.BTU.emu();
          AppMethodBeat.o(18064);
          paramInt = i;
          break;
        case 11:
          localq.jCj = locala.BTU.emu();
          AppMethodBeat.o(18064);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(18064);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.q
 * JD-Core Version:    0.6.2
 */