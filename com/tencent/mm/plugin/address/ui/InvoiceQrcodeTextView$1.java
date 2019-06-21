package com.tencent.mm.plugin.address.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.widget.b.a;

final class InvoiceQrcodeTextView$1
  implements View.OnLongClickListener
{
  InvoiceQrcodeTextView$1(InvoiceQrcodeTextView paramInvoiceQrcodeTextView)
  {
  }

  public final boolean onLongClick(final View paramView)
  {
    AppMethodBeat.i(16884);
    ClipboardManager localClipboardManager = (ClipboardManager)ah.getContext().getSystemService("clipboard");
    paramView = (TextView)paramView;
    if ((paramView.getText() != null) && (localClipboardManager != null))
    {
      final CharSequence localCharSequence = paramView.getText();
      Object localObject = new SpannableString(localCharSequence);
      ((SpannableString)localObject).setSpan(new BackgroundColorSpan(paramView.getContext().getResources().getColor(2131690200)), 0, localCharSequence.length(), 33);
      paramView.setText((CharSequence)localObject);
      localObject = new a(paramView.getContext(), paramView);
      ((a)localObject).zRZ = new InvoiceQrcodeTextView.1.1(this, paramView);
      ((a)localObject).rBm = new InvoiceQrcodeTextView.1.2(this, localClipboardManager, paramView);
      ((a)localObject).zHM = new PopupWindow.OnDismissListener()
      {
        public final void onDismiss()
        {
          AppMethodBeat.i(16883);
          paramView.setText(localCharSequence);
          AppMethodBeat.o(16883);
        }
      };
      ((a)localObject).dn(0, 0);
    }
    AppMethodBeat.o(16884);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView.1
 * JD-Core Version:    0.6.2
 */