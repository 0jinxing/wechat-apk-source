package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aap extends com.tencent.mm.bt.a
{
  public String appId;
  public int cBc;
  public String csu;
  public String iconUrl;
  public int type;
  public String username;
  public String wfO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51388);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      if (this.appId != null)
        paramArrayOfObject.e(2, this.appId);
      paramArrayOfObject.iz(3, this.cBc);
      if (this.iconUrl != null)
        paramArrayOfObject.e(4, this.iconUrl);
      paramArrayOfObject.iz(5, this.type);
      if (this.csu != null)
        paramArrayOfObject.e(6, this.csu);
      if (this.wfO != null)
        paramArrayOfObject.e(7, this.wfO);
      AppMethodBeat.o(51388);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label581;
    label581: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.appId != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.appId);
      i += e.a.a.b.b.a.bs(3, this.cBc);
      paramInt = i;
      if (this.iconUrl != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.iconUrl);
      i = paramInt + e.a.a.b.b.a.bs(5, this.type);
      paramInt = i;
      if (this.csu != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.csu);
      i = paramInt;
      if (this.wfO != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wfO);
      AppMethodBeat.o(51388);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51388);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aap localaap = (aap)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51388);
          break;
        case 1:
          localaap.username = locala.BTU.readString();
          AppMethodBeat.o(51388);
          paramInt = i;
          break;
        case 2:
          localaap.appId = locala.BTU.readString();
          AppMethodBeat.o(51388);
          paramInt = i;
          break;
        case 3:
          localaap.cBc = locala.BTU.vd();
          AppMethodBeat.o(51388);
          paramInt = i;
          break;
        case 4:
          localaap.iconUrl = locala.BTU.readString();
          AppMethodBeat.o(51388);
          paramInt = i;
          break;
        case 5:
          localaap.type = locala.BTU.vd();
          AppMethodBeat.o(51388);
          paramInt = i;
          break;
        case 6:
          localaap.csu = locala.BTU.readString();
          AppMethodBeat.o(51388);
          paramInt = i;
          break;
        case 7:
          localaap.wfO = locala.BTU.readString();
          AppMethodBeat.o(51388);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51388);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aap
 * JD-Core Version:    0.6.2
 */