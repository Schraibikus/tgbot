package ru.pocoloco.tgbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pocoloco.tgbot.entity.ActiveChat;

import java.util.Optional;


@Repository
public interface ActiveChatRepository extends JpaRepository<ActiveChat, Long> {

    Optional<ActiveChat> findActiveChatByChatId(Long chatId);

}
