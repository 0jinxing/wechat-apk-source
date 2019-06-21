package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class avs extends bsr
{
  public String csB;
  public String cvO;
  public String signature;
  public String url;
  public String wzd;
  public String wzf;
  public String wzg;
  public b wzh;
  public int wzi;
  public LinkedList<awg> wzm;

  public avs()
  {
    AppMethodBeat.i(10209);
    this.wzm = new LinkedList();
    AppMethodBeat.o(10209);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10210);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.csB != null)
        paramArrayOfObject.e(3, this.csB);
      if (this.wzd != null)
        paramArrayOfObject.e(4, this.wzd);
      if (this.cvO != null)
        paramArrayOfObject.e(5, this.cvO);
      if (this.wzf != null)
        paramArrayOfObject.e(6, this.wzf);
      if (this.signature != null)
        paramArrayOfObject.e(7, this.signature);
      if (this.wzg != null)
        paramArrayOfObject.e(8, this.wzg);
      if (this.wzh != null)
        paramArrayOfObject.c(9, this.wzh);
      paramArrayOfObject.iz(10, this.wzi);
      paramArrayOfObject.e(11, 8, this.wzm);
      AppMethodBeat.o(10210);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1055;
    label1055: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.url);
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.csB);
      int j = i;
      if (this.wzd != null)
        j = i + e.a.a.b.b.a.f(4, this.wzd);
      paramInt = j;
      if (this.cvO != null)
        paramInt = j + e.a.a.b.b.a.f(5, this.cvO);
      j = paramInt;
      if (this.wzf != null)
        j = paramInt + e.a.a.b.b.a.f(6, this.wzf);
      i = j;
      if (this.signature != null)
        i = j + e.a.a.b.b.a.f(7, this.signature);
      paramInt = i;
      if (this.wzg != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wzg);
      i = paramInt;
      if (this.wzh != null)
        i = paramInt + e.a.a.b.b.a.b(9, this.wzh);
      paramInt = i + e.a.a.b.b.a.bs(10, this.wzi) + e.a.a.a.c(11, 8, this.wzm);
      AppMethodBeat.o(10210);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wzm.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10210);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avs localavs = (avs)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10210);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavs.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(10210);
          paramInt = i;
          break;
        case 2:
          localavs.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10210);
          paramInt = i;
          break;
        case 3:
          localavs.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10210);
          paramInt = i;
          break;
        case 4:
          localavs.wzd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10210);
          paramInt = i;
          break;
        case 5:
          localavs.cvO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10210);
          paramInt = i;
          break;
        case 6:
          localavs.wzf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10210);
          paramInt = i;
          break;
        case 7:
          localavs.signature = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10210);
          paramInt = i;
          break;
        case 8:
          localavs.wzg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10210);
          paramInt = i;
          break;
        case 9:
          localavs.wzh = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(10210);
          paramInt = i;
          break;
        case 10:
          localavs.wzi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10210);
          paramInt = i;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new awg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavs.wzm.add(paramArrayOfObject);
          }
          AppMethodBeat.o(10210);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10210);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avs
 * JD-Core Version:    0.6.2
 */