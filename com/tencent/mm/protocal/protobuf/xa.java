package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class xa extends com.tencent.mm.bt.a
{
  public String deviceBrand;
  public String deviceModel;
  public String osName;
  public String osVersion;
  public String wcW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28385);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.deviceModel != null)
        paramArrayOfObject.e(1, this.deviceModel);
      if (this.deviceBrand != null)
        paramArrayOfObject.e(2, this.deviceBrand);
      if (this.osName != null)
        paramArrayOfObject.e(3, this.osName);
      if (this.osVersion != null)
        paramArrayOfObject.e(4, this.osVersion);
      if (this.wcW != null)
        paramArrayOfObject.e(5, this.wcW);
      AppMethodBeat.o(28385);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.deviceModel == null)
        break label494;
    label494: for (i = e.a.a.b.b.a.f(1, this.deviceModel) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.deviceBrand != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.deviceBrand);
      i = paramInt;
      if (this.osName != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.osName);
      paramInt = i;
      if (this.osVersion != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.osVersion);
      i = paramInt;
      if (this.wcW != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wcW);
      AppMethodBeat.o(28385);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28385);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        xa localxa = (xa)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28385);
          break;
        case 1:
          localxa.deviceModel = locala.BTU.readString();
          AppMethodBeat.o(28385);
          paramInt = i;
          break;
        case 2:
          localxa.deviceBrand = locala.BTU.readString();
          AppMethodBeat.o(28385);
          paramInt = i;
          break;
        case 3:
          localxa.osName = locala.BTU.readString();
          AppMethodBeat.o(28385);
          paramInt = i;
          break;
        case 4:
          localxa.osVersion = locala.BTU.readString();
          AppMethodBeat.o(28385);
          paramInt = i;
          break;
        case 5:
          localxa.wcW = locala.BTU.readString();
          AppMethodBeat.o(28385);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28385);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xa
 * JD-Core Version:    0.6.2
 */