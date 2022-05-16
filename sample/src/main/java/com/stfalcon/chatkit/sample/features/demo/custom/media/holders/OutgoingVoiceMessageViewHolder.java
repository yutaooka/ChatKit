package com.stfalcon.chatkit.sample.features.demo.custom.media.holders;

import android.view.View;
import android.widget.TextView;

import androidx.lifecycle.LifecycleOwner;

import com.stfalcon.chatkit.messages.MessageHolders;
import com.stfalcon.chatkit.sample.R;
import com.stfalcon.chatkit.sample.common.data.model.Message;
import com.stfalcon.chatkit.sample.utils.FormatUtils;
import com.stfalcon.chatkit.utils.DateFormatter;

/*
 * Created by troy379 on 05.04.17.
 */
public class OutgoingVoiceMessageViewHolder
        extends MessageHolders.OutgoingTextMessageViewHolder<Message> {

    private TextView tvDuration;
    private TextView tvTime;

    public OutgoingVoiceMessageViewHolder(View itemView, Object payload) {
        super(itemView, payload);
        tvDuration = itemView.findViewById(R.id.duration);
        tvTime = itemView.findViewById(R.id.time);
    }

    @Override
    public void onBind(Message message, LifecycleOwner lifecycleOwner) {
        super.onBind(message, lifecycleOwner);
        tvDuration.setText(
                FormatUtils.getDurationString(
                        message.getVoice().getDuration()));
        tvTime.setText(DateFormatter.format(message.getCreatedAt(), DateFormatter.Template.TIME));
    }
}
