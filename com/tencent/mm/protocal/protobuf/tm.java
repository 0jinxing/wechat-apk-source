package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class tm extends com.tencent.mm.bt.a
{
  public String kKZ;
  public String kbW;
  public String kbX;
  public String title;
  public String url;
  public String vTL;
  public String vTM;
  public long vUW;
  public String vUX;
  public String vUY;
  public arp waC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89052);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.kbW != null)
        paramArrayOfObject.e(2, this.kbW);
      if (this.kbX != null)
        paramArrayOfObject.e(3, this.kbX);
      if (this.url != null)
        paramArrayOfObject.e(4, this.url);
      paramArrayOfObject.ai(5, this.vUW);
      if (this.vUX != null)
        paramArrayOfObject.e(6, this.vUX);
      if (this.vUY != null)
        paramArrayOfObject.e(7, this.vUY);
      if (this.kKZ != null)
        paramArrayOfObject.e(8, this.kKZ);
      if (this.waC != null)
      {
        paramArrayOfObject.iy(9, this.waC.computeSize());
        this.waC.writeFields(paramArrayOfObject);
      }
      if (this.vTL != null)
        paramArrayOfObject.e(10, this.vTL);
      if (this.vTM != null)
        paramArrayOfObject.e(11, this.vTM);
      AppMethodBeat.o(89052);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label953;
    label953: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.kbW != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.kbW);
      i = paramInt;
      if (this.kbX != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kbX);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.url);
      i = paramInt + e.a.a.b.b.a.o(5, this.vUW);
      paramInt = i;
      if (this.vUX != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vUX);
      i = paramInt;
      if (this.vUY != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vUY);
      paramInt = i;
      if (this.kKZ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.kKZ);
      i = paramInt;
      if (this.waC != null)
        i = paramInt + e.a.a.a.ix(9, this.waC.computeSize());
      paramInt = i;
      if (this.vTL != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vTL);
      i = paramInt;
      if (this.vTM != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.vTM);
      AppMethodBeat.o(89052);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89052);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        tm localtm = (tm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89052);
          break;
        case 1:
          localtm.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89052);
          paramInt = i;
          break;
        case 2:
          localtm.kbW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89052);
          paramInt = i;
          break;
        case 3:
          localtm.kbX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89052);
          paramInt = i;
          break;
        case 4:
          localtm.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89052);
          paramInt = i;
          break;
        case 5:
          localtm.vUW = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(89052);
          paramInt = i;
          break;
        case 6:
          localtm.vUX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89052);
          paramInt = i;
          break;
        case 7:
          localtm.vUY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89052);
          paramInt = i;
          break;
        case 8:
          localtm.kKZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89052);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new arp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localtm.waC = paramArrayOfObject;
          }
          AppMethodBeat.o(89052);
          paramInt = i;
          break;
        case 10:
          localtm.vTL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89052);
          paramInt = i;
          break;
        case 11:
          localtm.vTM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89052);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89052);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.tm
 * JD-Core Version:    0.6.2
 */