package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class uv extends bsr
{
  public String Name;
  public int jBv;
  public String wcl;
  public String wcm;
  public axx wcn;
  public LinkedList<bts> wco;
  public String wcp;
  public String wcq;

  public uv()
  {
    AppMethodBeat.i(28377);
    this.wco = new LinkedList();
    AppMethodBeat.o(28377);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28378);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcn == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Loc");
        AppMethodBeat.o(28378);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.Name != null)
        paramArrayOfObject.e(2, this.Name);
      if (this.wcl != null)
        paramArrayOfObject.e(3, this.wcl);
      if (this.wcm != null)
        paramArrayOfObject.e(4, this.wcm);
      if (this.wcn != null)
      {
        paramArrayOfObject.iy(5, this.wcn.computeSize());
        this.wcn.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.jBv);
      paramArrayOfObject.e(7, 8, this.wco);
      if (this.wcp != null)
        paramArrayOfObject.e(8, this.wcp);
      if (this.wcq != null)
        paramArrayOfObject.e(9, this.wcq);
      AppMethodBeat.o(28378);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1064;
    label1064: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Name != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Name);
      paramInt = i;
      if (this.wcl != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wcl);
      i = paramInt;
      if (this.wcm != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wcm);
      paramInt = i;
      if (this.wcn != null)
        paramInt = i + e.a.a.a.ix(5, this.wcn.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(6, this.jBv) + e.a.a.a.c(7, 8, this.wco);
      paramInt = i;
      if (this.wcp != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wcp);
      i = paramInt;
      if (this.wcq != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wcq);
      AppMethodBeat.o(28378);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wco.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcn == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Loc");
          AppMethodBeat.o(28378);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28378);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        uv localuv = (uv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28378);
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
            localuv.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28378);
          paramInt = i;
          break;
        case 2:
          localuv.Name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28378);
          paramInt = i;
          break;
        case 3:
          localuv.wcl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28378);
          paramInt = i;
          break;
        case 4:
          localuv.wcm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28378);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new axx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuv.wcn = paramArrayOfObject;
          }
          AppMethodBeat.o(28378);
          paramInt = i;
          break;
        case 6:
          localuv.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28378);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuv.wco.add(localObject1);
          }
          AppMethodBeat.o(28378);
          paramInt = i;
          break;
        case 8:
          localuv.wcp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28378);
          paramInt = i;
          break;
        case 9:
          localuv.wcq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28378);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28378);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.uv
 * JD-Core Version:    0.6.2
 */