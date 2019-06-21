package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bky extends btd
{
  public String content;
  public String kdE;
  public boolean kep;
  public int status;
  public String vBF;
  public String vBG;
  public String wNR;
  public String wNS;
  public String wNT;
  public String wNU;
  public String wNV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89122);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vBF != null)
        paramArrayOfObject.e(2, this.vBF);
      if (this.vBG != null)
        paramArrayOfObject.e(3, this.vBG);
      paramArrayOfObject.iz(4, this.status);
      if (this.content != null)
        paramArrayOfObject.e(5, this.content);
      if (this.kdE != null)
        paramArrayOfObject.e(6, this.kdE);
      if (this.wNR != null)
        paramArrayOfObject.e(7, this.wNR);
      paramArrayOfObject.aO(8, this.kep);
      if (this.wNS != null)
        paramArrayOfObject.e(9, this.wNS);
      if (this.wNT != null)
        paramArrayOfObject.e(10, this.wNT);
      if (this.wNU != null)
        paramArrayOfObject.e(11, this.wNU);
      if (this.wNV != null)
        paramArrayOfObject.e(12, this.wNV);
      AppMethodBeat.o(89122);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1001;
    label1001: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vBF != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vBF);
      i = paramInt;
      if (this.vBG != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vBG);
      i += e.a.a.b.b.a.bs(4, this.status);
      paramInt = i;
      if (this.content != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.content);
      i = paramInt;
      if (this.kdE != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.kdE);
      paramInt = i;
      if (this.wNR != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wNR);
      i = paramInt + (e.a.a.b.b.a.fv(8) + 1);
      paramInt = i;
      if (this.wNS != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wNS);
      i = paramInt;
      if (this.wNT != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.wNT);
      paramInt = i;
      if (this.wNU != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wNU);
      i = paramInt;
      if (this.wNV != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wNV);
      AppMethodBeat.o(89122);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89122);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bky localbky = (bky)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89122);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbky.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        case 2:
          localbky.vBF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        case 3:
          localbky.vBG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        case 4:
          localbky.status = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        case 5:
          localbky.content = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        case 6:
          localbky.kdE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        case 7:
          localbky.wNR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        case 8:
          localbky.kep = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        case 9:
          localbky.wNS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        case 10:
          localbky.wNT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        case 11:
          localbky.wNU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        case 12:
          localbky.wNV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89122);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89122);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bky
 * JD-Core Version:    0.6.2
 */